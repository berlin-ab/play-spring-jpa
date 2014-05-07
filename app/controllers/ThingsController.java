package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import things.Thing;
import things.ThingRepository;
import views.html.OtherThing.*;

@Component
public class ThingsController extends Controller {

    @Autowired
    ThingRepository thingRepository;

    public Result index() {
        return ok(index.render(thingRepository.findAll()));
    }

    public Result newThing(){
        return ok(newThing.render());
    }

    @Transactional
    public Result create() {
        DynamicForm requestData = Form.form().bindFromRequest();

        thingRepository.save(new Thing(requestData.get("name")));

        return redirect("/");
    }

    public Result delete(Long id) {
        thingRepository.delete(id);
        return redirect("/");
    }
}