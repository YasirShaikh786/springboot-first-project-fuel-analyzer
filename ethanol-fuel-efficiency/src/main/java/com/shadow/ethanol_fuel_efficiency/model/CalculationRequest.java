package com.shadow.ethanol_fuel_efficiency.model;

public class CalculationRequest {
    private String fuelType;      
    private double mileage;       
    private double costPerLiter;  

    // Getters and Setters
    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public double getMileage() { return mileage; }
    public void setMileage(double mileage) { this.mileage = mileage; }

    public double getCostPerLiter() { return costPerLiter; }
    public void setCostPerLiter(double costPerLiter) { this.costPerLiter = costPerLiter; }
}
