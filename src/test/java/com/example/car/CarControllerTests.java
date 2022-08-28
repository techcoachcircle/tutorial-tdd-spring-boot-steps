package com.example.car;

import com.example.car.model.Car;
import com.example.car.service.CarService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Design Assumptions:
 * 1. Common Spring flow : controller -> service
 * 2. Car is a model object
 * <p>
 * Requirements derived from higher-level tests (Contract tests in this case):
 * 1. Car has id, name and type (See: src/test/resources/contracts/car/shouldReturnCars.groovy)
 * 2. Data is returned in json format
 */

@WebMvcTest
@AutoConfigureMockMvc
public class CarControllerTests {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CarService carService;

    @Test
    public void getCars_ReturnsCars() throws Exception {
        //arrange
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "prius", "hybrid"));
        cars.add(new Car(2L, "tesla", "electric"));
        when(this.carService.getCars()).thenReturn(cars);

        //act & assert
        this.mockMvc.perform(get("/cars"))
                .andExpect(status().isOk())
                .andExpect(content().json(
                        "[{\"id\":1,\"name\":\"prius\",\"type\":\"hybrid\"},{\"id\":2,\"name\":\"tesla\",\"type\":\"electric\"}]"
                ));
    }

}