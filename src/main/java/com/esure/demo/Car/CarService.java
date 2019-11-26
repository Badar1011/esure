package com.esure.demo.Car;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CarService {


    public List<CarDetails> getCarByColour(String colour) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        List<Car> cars = new ArrayList<>();
        try {
            cars = objectMapper.readValue(new File("src/main/resources/cars.json"), new TypeReference<List<Car>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<CarDetails> carDetails = new ArrayList<>();
        cars.forEach(car -> car.getCars().stream()
            .filter(carDetail -> carDetail.getColour().equalsIgnoreCase(colour))
            .forEach(carDetails::add));
        return carDetails;
    }
}
