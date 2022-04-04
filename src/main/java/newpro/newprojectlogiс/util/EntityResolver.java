package newpro.newprojectlogiс.util;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class EntityResolver implements ObjectIdResolver {
    private EntityManager entityManager;

    @Autowired
    public EntityResolver(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void bindItem(ObjectIdGenerator.IdKey idKey, Object o) {

    }

    @Override
    public Object resolveId(ObjectIdGenerator.IdKey id) {
        return entityManager.find(id.scope, Long.parseLong(id.key.toString()));
    }

    @Override
    public ObjectIdResolver newForDeserialization(Object o) {
        return this;
    }

    @Override
    public boolean canUseFor(ObjectIdResolver objectIdResolver) {
        return false;
    }
}
