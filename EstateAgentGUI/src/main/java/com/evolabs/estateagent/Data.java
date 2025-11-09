/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evolabs.estateagent;

/**
 *
 * @author silol
 */


public class Data {
    private String agentLocation;
    private String agentName;
    private double propertyPrice;
    private double commissionPercentage;

    public Data(String agentLocation, String agentName, double propertyPrice, double commissionPercentage) {
        this.agentLocation = agentLocation;
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
        this.commissionPercentage = commissionPercentage;
    }

    public String getAgentLocation() { return agentLocation; }
    public String getAgentName() { return agentName; }
    public double getPropertyPrice() { return propertyPrice; }
    public double getCommissionPercentage() { return commissionPercentage; }
}
