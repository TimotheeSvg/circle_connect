package fr.esgi.circle_connect.business;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.util.*;

public class Room {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    @NotBlank(message="Merci de préciser le nom de la salle")
    public String name;


    @Column(nullable = false)
    @NotBlank(message="Merci de préciser le nombre de joueurs maximum")
    public int max_player;


    @Column(nullable = true)
    public String password;


    @Column(nullable = false)
    @NotBlank(message="Merci de préciser la date de la partie")
    public Date date;
}