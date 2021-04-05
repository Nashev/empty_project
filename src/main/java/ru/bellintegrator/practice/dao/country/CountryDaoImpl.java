package ru.bellintegrator.practice.dao.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.bellintegrator.practice.model.Country;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * {@inheritCountry}
 */
@Repository
public class CountryDaoImpl implements CountryDao {

    private final EntityManager em;

    @Autowired
    public CountryDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritCountry}
     */
    @Override
    public List<Country> all() {
        TypedQuery<Country> query = em.createQuery("SELECT t FROM Country t", Country.class);
        return query.getResultList();
    }

    /**
     * {@inheritCountry}
     */
    @Override
    public Country loadById(Long id) {
        return em.find(Country.class, id);
    }

    /**
     * {@inheritCountry}
     */
    @Override
    public void save(Country Country) {
        em.persist(Country);
    }
}
