/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evolabs.estateagent;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EstateAgentTest {

    @Test
    public void CalculateCommission_CalculateSuccessfully() {
       
        EstateAgent agent = new EstateAgent();
        double propertyPrice = 100000.0;
        double commissionPercent = 10.0; // 10%

        
        double result = agent.CalculateCommission(propertyPrice, commissionPercent);

        
        assertEquals(10000.0, result, 0.0001, "Commission should be 10000 for 100000 @ 10%");
    }

    @Test
    public void CalculateCommission_CalculatedUnSuccessfully() {
  
        
        EstateAgent agent = new EstateAgent();
        double propertyPrice = 50000.0;
        double commissionPercent = 5.0; 
        
        double result = agent.CalculateCommission(propertyPrice, commissionPercent);

        assertNotEquals(2000.0, result, "Commission must not be 2000 for 50000 @ 5% (expected 2500)");  
        assertEquals(2500.0, result, 0.0001, "Commission should be 2500 for 50000 @ 5%");
    }

    @Test
    public void ValidationTest_InvalidAndValidData() {
        EstateAgent agent = new EstateAgent();

        
        Data d1 = new Data("--Select Location--", "Alice", 100000.0, 5.0);
        assertFalse(agent.validateData(d1), "Validation should fail when location not selected.");

        
        Data d2 = new Data("Durban", "   ", 100000.0, 5.0);
        assertFalse(agent.validateData(d2), "Validation should fail for empty agent name.");

        
        Data d3 = new Data("Pretoria", "Bob", 0.0, 5.0);
        assertFalse(agent.validateData(d3), "Validation should fail for property price <= 0.");

        
        Data d4 = new Data("Capetown", "Carol", 100000.0, 0.0);
        assertFalse(agent.validateData(d4), "Validation should fail for commission percentage <= 0.");

       
        Data good = new Data("Durban", "Silo", 75000.0, 7.5);
        assertTrue(agent.validateData(good), "Validation should pass for valid data.");
    }
}
