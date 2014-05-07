import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import play.Application;
import play.GlobalSettings;

public class Global extends GlobalSettings {
    private AnnotationConfigApplicationContext context;

    @Override
    public void beforeStart(play.Application application) {
        if(context != null) {
            context.close();
        }

        context = new AnnotationConfigApplicationContext(things.OtherConfig.class);
    }

    @Override
    public <A> A getControllerInstance(Class<A> clazz) {
        return context.getBean(clazz);
    }

    public void onStop(Application application) {
        context.close();
    }
}
