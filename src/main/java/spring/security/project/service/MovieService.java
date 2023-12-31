package spring.security.project.service;

import java.util.List;
import spring.security.project.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
