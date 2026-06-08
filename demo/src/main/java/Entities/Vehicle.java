package Entities;

public class Vehicle {
    private int vehicleId;
    private String vehicleModel;
    private double rentalPricePerDay;

    public Vehicle(int vehicleId, String vehicleModel, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }
}
