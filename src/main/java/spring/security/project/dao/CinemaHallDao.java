package spring.security.project.dao;

import java.util.List;
import java.util.Optional;
import spring.security.project.model.CinemaHall;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
