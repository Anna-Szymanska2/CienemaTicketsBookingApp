package com.example.cinematicketsbookingapp.model;

import com.example.cinematicketsbookingapp.jpa.MovieRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Predicate;

@RestController
public class MovieResource {

    MovieRepository movieRepository;

    public MovieResource(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

//    @PostMapping("/movies")
//    public List<Movie> getMoviesFromTimeInterval(@RequestBody LocalDateTime startTime, @RequestBody LocalDateTime endTime){
//        return  movieRepository.findAll();
//    }

//    @GetMapping("/movies")
//    public List<Movie> getMoviesFromTimeInterval(){
//        LocalDateTime startDate = LocalDateTime.now().plusDays(19);
//        LocalDateTime endDate = LocalDateTime.now().plusDays(20);
//        System.out.println(startDate);
//        System.out.println(endDate);
//       // Specification<Movie> specification = hasScreeningWithStartDateGreaterThan(date);
//        List<Movie> movies = movieRepository.findAll();
//        for(Movie movie : movies){
//            List<Screening> screenings = movie.getScreenings();
//            Predicate<? super Screening> predicate = screening ->
//                    (!screening.getStartDate().isBefore(startDate) && !screening.getEndDate().isAfter(endDate));
//            List<Screening> chosenScreenings = screenings.stream().filter(predicate).toList();
//            movie.setScreenings(chosenScreenings);
//        }
//        return  movies;
//    }

    @GetMapping("/movies")
    public List<Movie> getMoviesFromTimeInterval(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                                                     LocalDateTime startDate, @RequestParam @DateTimeFormat
            (iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate){
        List<Movie> movies = movieRepository.findAll();
        for(Movie movie : movies){
            List<Screening> screenings = movie.getScreenings();
            Predicate<? super Screening> predicate = screening ->
                    (!screening.getStartDate().isBefore(startDate) && !screening.getEndDate().isAfter(endDate));
            List<Screening> chosenScreenings = screenings.stream().filter(predicate).toList();
            movie.setScreenings(chosenScreenings);
        }
        return  movies;
    }

}
