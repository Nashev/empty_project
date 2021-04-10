package ru.bellintegrator.practice.dao.userDoc;

import ru.bellintegrator.practice.model.UserDoc;

import java.util.List;

/**
 * DAO для работы с UserDoc
 */
public interface UserDocDao {
    /**
     * Получить все объекты UserDoc
     *
     * @return
     */
    List<UserDoc> all();

    /**
     * Получить UserDoc по идентификатору
     *
     * @param id
     * @return
     */
    UserDoc loadById(Long id);

    /**
     * Получить UserDoc по имени
     *
     * @param name
     * @return
     */
    UserDoc loadByName(String name);

    /**
     * Сохранить UserDoc
     *
     * @param userDoc
     */
    void save(UserDoc userDoc);
}
