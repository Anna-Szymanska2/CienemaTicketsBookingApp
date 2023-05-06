package com.example.cienematicketsbookingapp.model;

import jakarta.persistence.criteria.Join;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;

public class MovieSpecifications {
    public static Specification<Movie> hasScreeningWithStartDateGreaterThan(LocalDateTime startDate) {
        return (root, query, criteriaBuilder) -> {
            Join<Movie, Screening> movieScreenings = root.join("screenings");
            return criteriaBuilder.greaterThan(movieScreenings.get("startDate"), startDate);
        };
    }
}
