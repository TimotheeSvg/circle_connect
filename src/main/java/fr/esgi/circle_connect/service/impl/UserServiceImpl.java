package fr.esgi.circle_connect.service.impl;

import fr.esgi.circle_connect.business.User;
import fr.esgi.circle_connect.repository.UserRepository;
import fr.esgi.circle_connect.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return null;
    }
}
