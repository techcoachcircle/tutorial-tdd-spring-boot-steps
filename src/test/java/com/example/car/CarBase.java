package com.example.car;

import com.example.car.model.Car;
import com.example.car.repository.CarRepository;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class CarBase {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private CarRepository carRepository;

    @Transactional
    @BeforeEach
    public void addData () {
        carRepository.save(new Car("prius", "hybrid"));
        carRepository.save(new Car("tesla", "electric"));
    }

    @BeforeEach
    public void initialiseRestAssuredMockMvcWebApplicationContext() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
    }

}