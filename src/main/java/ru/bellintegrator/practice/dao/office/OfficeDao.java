package ru.bellintegrator.practice.dao.office;

import java.util.List;
import ru.bellintegrator.practice.model.Office;

/**
 * DAO для работы с Office
 */
public interface OfficeDao {
    /**
     * Получить все объекты Office
     *
     * @return
     */
    List<Office> all();

    /**
     * Получить Office по идентификатору
     *
     * @param id
     * @return
     */
    Office loadById(Long id);

    /**
     * Сохранить Office
     *
     * @param office
     */
    void save(Office office);
}
