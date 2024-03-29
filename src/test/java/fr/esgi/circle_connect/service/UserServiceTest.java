package fr.esgi.circle_connect.service;

import fr.esgi.circle_connect.business.User;
import fr.esgi.circle_connect.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @MockBean
    UserRepository userRepository;

    @Test
    void testAddUser() {
        User user = new User();
        user.setEmail("test@test.com");
        user.setPassword("test_1234");

        when(userRepository.save(user)).thenReturn(user);

        User userEnregistre = userService.addUser(user);
        assertEquals(user, userEnregistre);
    }
}
