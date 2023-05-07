package com.example.cinematicketsbookingapp.jpa;

import com.example.cinematicketsbookingapp.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening, Integer> {
}
