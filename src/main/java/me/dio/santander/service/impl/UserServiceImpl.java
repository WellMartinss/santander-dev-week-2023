package me.dio.santander.service.impl;

import me.dio.santander.model.User;
import me.dio.santander.repository.UserRepository;
import me.dio.santander.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) throws NoSuchFieldException {
        return userRepository.findById(id).orElseThrow(NoSuchFieldException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
