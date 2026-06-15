package com.shadow.ethanol_fuel_efficiency.model;

public class CalculationResponse {
    private String fuelType;
    private double costPerKm;  // Rs/km
    private String summary;

    public CalculationResponse(String fuelType, double costPerKm, String summary) {
        this.fuelType = fuelType;
        this.costPerKm = costPerKm;
        this.summary = summary;
    }

    // Getters and Setters
    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public double getCostPerKm() { return costPerKm; }
    public void setCostPerKm(double costPerKm) { this.costPerKm = costPerKm; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
}
