package com.shadow.ethanol_fuel_efficiency.controller;

import com.shadow.ethanol_fuel_efficiency.model.CalculationRequest;
import com.shadow.ethanol_fuel_efficiency.model.CalculationResponse;
import com.shadow.ethanol_fuel_efficiency.service.EfficiencyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fuel") // Renamed from /api/calculator to match its real purpose
@CrossOrigin(origins = "*") 
public class EfficiencyController { // Renamed from CalculatorController to match your project

    private final EfficiencyService efficiencyService; // Renamed variable for clean readability

    // Constructor Injection for the Service layer
    public EfficiencyController(EfficiencyService efficiencyService) {
        this.efficiencyService = efficiencyService;
    }

    @PostMapping("/calculate") // Renamed from /add to match the frontend fetch call
    public CalculationResponse processFuelData(@RequestBody CalculationRequest request) {
        return efficiencyService.calculateRunningCost(request);
    }
}
