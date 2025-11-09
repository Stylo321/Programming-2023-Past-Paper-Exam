/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evolabs.estateagent;

/**
 *
 * @author silol
 */


public interface IEstateAgent {
    double CalculateCommission(double propertyPrice, double commissionPercentage);
    boolean validateData(Data dataToValidate);
}
