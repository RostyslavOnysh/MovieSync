package spring.security.project.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import spring.security.project.dao.AbstractDao;
import spring.security.project.dao.MovieDao;
import spring.security.project.model.Movie;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
