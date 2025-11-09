/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evolabs.estateagent;

/**
 *
 * @author silol
 */


public class EstateAgent implements IEstateAgent {

    @Override
    public double CalculateCommission(double propertyPrice, double commissionPercentage) {
        return propertyPrice * (commissionPercentage / 100);
    }

    @Override
    public boolean validateData(Data dataToValidate) {
        if (dataToValidate == null) return false;

        if (dataToValidate.getAgentLocation() == null ||
            dataToValidate.getAgentLocation().trim().isEmpty() ||
            dataToValidate.getAgentLocation().equals("--Select Location--")) {
            return false;
        }

        if (dataToValidate.getAgentName() == null || dataToValidate.getAgentName().trim().isEmpty()) {
            return false;
        }

        if (dataToValidate.getPropertyPrice() <= 0 || dataToValidate.getCommissionPercentage() <= 0) {
            return false;
        }

        return true;
    }

    // Optional helper to generate report text
    public String generateReport(Data data) {
        double commission = CalculateCommission(data.getPropertyPrice(), data.getCommissionPercentage());
        return "Estate Agent Report\n" +
               "===================\n" +
               "Agent Name: " + data.getAgentName() + "\n" +
               "Location: " + data.getAgentLocation() + "\n" +
               "Property Price: R" + String.format("%.2f", data.getPropertyPrice()) + "\n" +
               "Commission Percentage: " + String.format("%.2f", data.getCommissionPercentage()) + "%\n" +
               "Commission Amount: R" + String.format("%.2f", commission) + "\n";
    }
}
