package com.example.cinematicketsbookingapp.model;

import com.example.cinematicketsbookingapp.dtos.ScreeningDto;
import com.example.cinematicketsbookingapp.dtos.SeatDto;
import com.example.cinematicketsbookingapp.jpa.ScreeningRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ScreeningResource {

    private ScreeningRepository screeningRepository;

    public ScreeningResource(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    @GetMapping("/screenings/{id}")
    public ScreeningDto getScreening(@PathVariable int id){
        Optional<Screening> screening = screeningRepository.findById(id);
        if(screening.isEmpty())
            throw new ScreeningNotFoundException("id: " + id);
        List<Seat> allSeats = screening.get().getRoom().getSeats();
        List<SeatDto> seatDtos = new ArrayList<>();
        List<Reservation> reservations = screening.get().getReservations();
        for (Seat seat: allSeats){
            boolean isReserved = reservations.stream().anyMatch(reservation -> reservation.getSeat().getId() == seat.getId());
            SeatDto seatDto = new SeatDto(seat.getId(), seat.getRowName(), seat.getColumnName(), !isReserved);
            seatDtos.add(seatDto);

        }
        return new ScreeningDto(screening.get().getId(), screening.get().getRoom().getName(), seatDtos);

    }
}
