package fr.esgi.circle_connect.repository;

import fr.esgi.circle_connect.business.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
