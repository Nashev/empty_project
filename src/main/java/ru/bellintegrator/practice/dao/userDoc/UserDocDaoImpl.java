package ru.bellintegrator.practice.dao.userDoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.bellintegrator.practice.model.UserDoc;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * {@inheritDoc}
 */
@Repository
public class UserDocDaoImpl implements UserDocDao {

    private final EntityManager em;

    @Autowired
    public UserDocDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UserDoc> all() {
        TypedQuery<UserDoc> query = em.createQuery("SELECT p FROM UserDoc p", UserDoc.class);
        return query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDoc loadById(Long id) {
        return em.find(UserDoc.class, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDoc loadByName(String name) {
        CriteriaQuery<UserDoc> criteria = buildCriteria(name);
        TypedQuery<UserDoc> query = em.createQuery(criteria);
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(UserDoc userDoc) {
        em.persist(userDoc);
    }

    private CriteriaQuery<UserDoc> buildCriteria(String name) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<UserDoc> criteria = builder.createQuery(UserDoc.class);

        Root<UserDoc> userDoc = criteria.from(UserDoc.class);
        criteria.where(builder.equal(userDoc.get("name"), name));

        return criteria;
    }
}
