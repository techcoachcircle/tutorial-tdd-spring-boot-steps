package com.example.car.service;

import com.example.car.model.Car;
import com.example.car.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @Mock
    private CarRepository carRepository;

    @Test
    public void getCars_returnsCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "prius", "hybrid"));
        cars.add(new Car(2L, "tesla", "electric"));
        given(carRepository.findAll()).willReturn(cars);

        CarService carService = new CarService(carRepository);
        List<Car> car = carService.getCars();

        assertThat(car.get(0).getId()).isEqualTo(1L);
        assertThat(car.get(0).getName()).isEqualTo("prius");
        assertThat(car.get(0).getType()).isEqualTo("hybrid");

        assertThat(car.get(1).getId()).isEqualTo(2L);
        assertThat(car.get(1).getName()).isEqualTo("tesla");
        assertThat(car.get(1).getType()).isEqualTo("electric");
    }


}