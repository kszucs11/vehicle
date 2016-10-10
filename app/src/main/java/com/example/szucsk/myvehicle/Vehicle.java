package com.example.szucsk.myvehicle;

/**  Documentation comments:
 * Created by szucsk on 10/10/2016.
 */
public class Vehicle {
    public static int counter = 0;
    private String make;
    private int year;
    private String message;

    public Vehicle() {   // default constructor
        this.make = "Volvo";
        this.year = 2012;
        this.message = "This is the default message.";
    }

    public Vehicle(String make, int year) {     // constructor takes two parameters
        this.make = make;
        this.year = year;
        this.message = "Your car is a " + make + " built in " + year + ".";
        count();
    }

    public Vehicle(String make) {
        this();
        this.make = make;
        message = "You didn't type in year value.";
        count();
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }

    private void count(){
        this.counter++;
    }



}
