package ru.bellintegrator.practice.service;

import org.springframework.validation.annotation.Validated;
import ru.bellintegrator.practice.view.UserView;

import javax.validation.Valid;
import java.util.List;

/**
 * Сервис
 */
@Validated
public interface UserService {

    /**
     * Добавить нового пользователя в БД
     *
     * @param user
     */
    void add(@Valid UserView user);

    /**
     * Получить список пользователей
     *
     * @return {@User}
     */
    List<UserView> users();
}
