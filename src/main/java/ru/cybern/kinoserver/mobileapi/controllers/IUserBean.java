package ru.cybern.kinoserver.mobileapi.controllers;

import ru.cybern.kinoserver.mobileapi.db.entities.UserEntity;

import java.util.List;


public interface IUserBean {

    UserEntity saveUser(UserEntity user);

    void deleteUser(UserEntity user);

    UserEntity getUser(int id);

    boolean deleteUser(int id);

    List<UserEntity> getUsers();
}
