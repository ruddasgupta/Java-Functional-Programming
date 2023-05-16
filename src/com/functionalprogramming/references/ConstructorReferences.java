package com.functionalprogramming.references;

//interface Factory {
//    Vehicle prepare(String make, String model, int year);
//}
//
//class Vehicle {
//    private String make;
//    private String model;
//    private int year;
//
//    Vehicle(String make, String model, int year){
//        this.make = make;
//        this.model = model;
//        this.year = year;
//    }
//
//    public String toString(){
//        return "Vehicle[" + make +", " + model + ", " + year+ "]";
//    }
//}

import com.functionalprogramming.references.Factory;
import com.functionalprogramming.references.Vehicle;

public class ConstructorReferences {
    static Vehicle factory(Factory factoryObj, String make, String model, int year) {
        return factoryObj.prepare(make, model, year);
    }

    public static void main(String[] args) {
        //Constructor reference
        Factory vehicle_factory = Vehicle::new;
        Vehicle carHonda = factory(vehicle_factory, "Honda", "Civic", 2017);
        System.out.println(carHonda);
    }
}