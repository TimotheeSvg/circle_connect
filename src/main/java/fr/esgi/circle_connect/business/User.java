package fr.esgi.circle_connect.business;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@RequiredArgsConstructor
@Data
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_seq")
    @SequenceGenerator(name="user_seq", initialValue = 1)
    private Long id;

    @Column(unique=true, nullable = false, updatable=true)
    @NotBlank(message="Merci de préciser l'email")
    private String email;

    @Column(nullable = false)
    @NotBlank(message="Merci de préciser le prénom")
    private String firstname;

    @Column(nullable = false)
    @NotBlank(message="Merci de préciser le nom")
    private String lastname;

    @Column(nullable = false)
    @NotBlank(message="Merci de préciser le mot de passe")
    @Length(min=8, message="Le mot de passe doit contenir au moins {min} caractères")
    private String password;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return id.equals(user.id);
    }

}
