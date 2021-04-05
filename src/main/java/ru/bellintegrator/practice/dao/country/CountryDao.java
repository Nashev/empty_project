package ru.bellintegrator.practice.dao.country;

import ru.bellintegrator.practice.model.Country;

import java.util.List;

/**
 * DAO для работы с Country
 */
public interface CountryDao {
    /**
     * Получить все объекты Country
     *
     * @return
     */
    List<Country> all();

    /**
     * Получить Country по идентификатору
     *
     * @param id
     * @return
     */
    Country loadById(Long id);

    /**
     * Сохранить Country
     *
     * @param house
     */
    void save(Country Country);
}
