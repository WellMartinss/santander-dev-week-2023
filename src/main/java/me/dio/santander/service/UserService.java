package me.dio.santander.service;

import me.dio.santander.model.User;

public interface UserService {

    User findById(Long id) throws NoSuchFieldException;
    User create(User userToCreate);



}
