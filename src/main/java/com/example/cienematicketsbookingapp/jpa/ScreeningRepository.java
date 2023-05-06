package com.example.cienematicketsbookingapp.jpa;

import com.example.cienematicketsbookingapp.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening, Integer> {
}
