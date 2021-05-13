package com.sb.protobuf;

import com.sb.model.Address;
import com.sb.model.Car;
import com.sb.model.Dealer;
import com.sb.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {
    public static void main(String[] args) {
        Address address = Address.newBuilder().setPostbox(123).setStreet("main street").setCity("bangalore").build();

        Car car1 = Car.newBuilder().setMake("Hyundai").setModel("Sedan").setYear(2019).build();

        Car car2 = Car.newBuilder().setMake("Honda").setModel("Hatchback").setYear(2021).build();

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        Dealer dealer = Dealer.newBuilder().putModel(2020, car1).putModel(2021, car2).build();

        // Returns if key exists else throws exception: java.lang.IllegalArgumentException
        System.out.println(dealer.getModelOrThrow(2020));
        // Returns if key exists else default value of enum
        System.out.println(dealer.getModelOrThrow(2020).getBodyStyle());

        Employee employee = Employee.newBuilder().setName("Sam").setAge(25).addAllCar(cars).setAddress(address).build();

        System.out.println(
               employee
        );
    }
}
