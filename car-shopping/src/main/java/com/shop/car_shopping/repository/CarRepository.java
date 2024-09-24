package com.shop.car_shopping.repository;

import com.shop.car_shopping.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
