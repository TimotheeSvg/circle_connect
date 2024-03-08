package fr.esgi.circle_connect.service;

import fr.esgi.circle_connect.business.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServiceIT {

    @Autowired
    UserService userService;

    /*@BeforeEach
    void setup() {
        userService.deleteAll();
    }*/

    @Test
    void testAddUser() {
        User user = new User();
        user.setFirstname("test");
        user.setLastname("test");
        user.setEmail("test@test.com");
        user.setPassword("test_1234");

        User userEnregistre = userService.addUser(user);
        assertEquals(user, userEnregistre);
    }

}
