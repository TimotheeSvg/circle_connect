package fr.esgi.circle_connect.business;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.util.*;

public class Video {

    public Video() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    @NotBlank(message="Merci de préciser une date de début")
    public int start_timestamp;

    @Column(nullable = false)
    @NotBlank(message="Merci de préciser une date de fin")
    public int end_timestamp;

    public Map<Integer, Float> mapping_timestamp_speed;

}