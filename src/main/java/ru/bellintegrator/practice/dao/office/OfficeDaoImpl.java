package ru.bellintegrator.practice.dao.office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.bellintegrator.practice.model.Office;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * {@inheritDoc}
 */
@Repository
public class OfficeDaoImpl implements OfficeDao {

    private final EntityManager em;

    @Autowired
    public OfficeDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Office> all() {
        TypedQuery<Office> query = em.createQuery("SELECT h FROM Office h", Office.class);
        return query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office loadById(Long id) {
        return em.find(Office.class, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Office office) {
        em.persist(office);
    }
}
