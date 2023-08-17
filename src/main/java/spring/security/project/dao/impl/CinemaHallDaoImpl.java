package spring.security.project.dao.impl;

import spring.security.project.dao.AbstractDao;
import spring.security.project.dao.CinemaHallDao;
import spring.security.project.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
