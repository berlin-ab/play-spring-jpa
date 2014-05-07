package things;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ThingRepository extends CrudRepository<Thing, Long> {
    public List findAll();
}
