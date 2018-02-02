package com.trnet.spring.dao;

import com.trnet.spring.model.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDao implements ICarDao {

    @Autowired
    SessionFactory sessionFactory;

    public void createCar(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

    public List<Car> getCars() {
        return null;
    }

    public void deleteCar(int id) {
        Session session = sessionFactory.getCurrentSession();
        Car car = (Car) session.get(Car.class, id);
        session.delete(car);
    }

    public void updateCar(Car car) {
        sessionFactory.getCurrentSession().update(car);
    }
}
