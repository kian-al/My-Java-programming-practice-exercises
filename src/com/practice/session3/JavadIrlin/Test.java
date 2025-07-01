package com.practice.session3.JavadIrlin;

public class Test {
    public static void main(String[] args) {
        // تست کلاس Vehicle
        Vehicle vehicle = new Vehicle("Generic Vehicle", 5000, 4, 120);
        System.out.println("Vehicle:");
        System.out.println("Name: " + vehicle.name);
        System.out.println("Price: " + vehicle.price);
        System.out.println("Seats: " + vehicle.numberOfSeats);
        System.out.println("Max Speed: " + vehicle.maxSpeed);

        // تست FlyingVehicle
        FlyingVehicle flyingVehicle = new FlyingVehicle(
                "Drone", 15000, 2, 200,
                "Electric", 2, 3, "Joystick"
        );
        System.out.println("\nFlyingVehicle:");
        System.out.println("Name: " + flyingVehicle.name);
        System.out.println("Fuel: " + flyingVehicle.fuel);
        System.out.println("Fins: " + flyingVehicle.numberOfFins);
        System.out.println("Wheels: " + flyingVehicle.numberOfWheels);
        System.out.println("Steering: " + flyingVehicle.steeringWheel);

        // تست Airplane
        Airplane airplane = new Airplane(
                "Airbus A320", 1000000, 180, 900,
                "Jet Fuel", 4, 6, "Yoke",
                "Iran Air", 6, "Captain Reza"
        );
        System.out.println("\nAirplane:"+airplane.name);
        System.out.println("Airline: " + airplane.airline);
        System.out.println("Crew: " + airplane.numberOfCrew);
        System.out.println("Captain: " + airplane.captain);

        // تست B707
        B707 b707 = new B707(
                "Boeing 707", 2000000, 150, 870,
                "Jet Fuel", 4, 8, "Yoke",
                "Javad Airlines", 8, "Captain Javad"
        );
        System.out.println("\nB707:"+b707.name);
        System.out.println("Airline: " + b707.airline);
        System.out.println("Crew: " + b707.numberOfCrew);
        System.out.println("Captain: " + b707.captain);
    }
}
