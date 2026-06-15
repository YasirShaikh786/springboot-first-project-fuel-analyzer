package com.shadow.ethanol_fuel_efficiency.service;

import com.shadow.ethanol_fuel_efficiency.model.CalculationRequest;
import com.shadow.ethanol_fuel_efficiency.model.CalculationResponse;
import org.springframework.stereotype.Service;

@Service
public class EfficiencyService {

    public CalculationResponse calculateRunningCost(CalculationRequest request) {
        // Prevent division by zero if mileage is empty/null
        if (request.getMileage() <= 0) {
            return new CalculationResponse(request.getFuelType(), 0, "Mileage must be greater than 0.");
        }

        // Calculate Rs/km
        double costPerKm = request.getCostPerLiter() / request.getMileage();
        
        String summary = String.format("%s costs Rs. %.2f per kilometer to run.", 
                request.getFuelType(), costPerKm);

        return new CalculationResponse(request.getFuelType(), costPerKm, summary);
    }
}
