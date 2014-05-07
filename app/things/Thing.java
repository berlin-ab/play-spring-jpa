package things;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Thing {
    @Id
    @GeneratedValue
    Long id;

    String name;

    public Thing() {}

    public Thing(String name) {
        this.name = name;
    }

    public String foobar() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
