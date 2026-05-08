package generics.ecommerce.utilservice;

import java.util.List;

public interface CrudService<Entity, Id> {
    //  CRUD

    Entity create(Entity entity);
    void updateById(Id id, Entity entity);
    void deleteById(Id id);

    List<Entity> getAll();
    Entity getById(Id id);

    boolean existsById(Id id);

}
