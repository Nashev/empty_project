package ru.bellintegrator.practice.dao.doc;

import ru.bellintegrator.practice.model.Doc;

import java.util.List;

/**
 * DAO для работы с Doc
 */
public interface DocDao {
    /**
     * Получить все объекты Doc
     *
     * @return
     */
    List<Doc> all();

    /**
     * Получить Doc по идентификатору
     *
     * @param id
     * @return
     */
    Doc loadById(Long id);

    /**
     * Сохранить Doc
     *
     * @param house
     */
    void save(Doc doc);
}
