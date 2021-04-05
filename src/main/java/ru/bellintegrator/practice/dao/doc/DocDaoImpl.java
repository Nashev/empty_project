package ru.bellintegrator.practice.dao.doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.bellintegrator.practice.model.Doc;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * {@inheritDoc}
 */
@Repository
public class DocDaoImpl implements DocDao {

    private final EntityManager em;

    @Autowired
    public DocDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Doc> all() {
        TypedQuery<Doc> query = em.createQuery("SELECT t FROM Doc t", Doc.class);
        return query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Doc loadById(Long id) {
        return em.find(Doc.class, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Doc Doc) {
        em.persist(Doc);
    }
}
