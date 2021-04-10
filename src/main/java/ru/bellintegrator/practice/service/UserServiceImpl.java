package ru.bellintegrator.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bellintegrator.practice.dao.user.UserDao;
import ru.bellintegrator.practice.model.mapper.MapperFacade;
import ru.bellintegrator.practice.model.User;
import ru.bellintegrator.practice.view.UserView;

import java.util.List;

/**
 * {@inheritDoc}
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserDao dao;
    private final MapperFacade mapperFacade;

    @Autowired
    public UserServiceImpl(UserDao dao, MapperFacade mapperFacade) {
        this.dao = dao;
        this.mapperFacade = mapperFacade;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void add(UserView view) {
        User user = new User();
        user.setFirstName(view.firstName);
        user.setMiddleName(view.middleName);
        user.setSecondName(view.secondName);
        user.setPosition(view.position);
        dao.save(user);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(readOnly = true)
    public List<UserView> users() {
        List<User> all = dao.all();
        return mapperFacade.mapAsList(all, UserView.class);
    }
}
