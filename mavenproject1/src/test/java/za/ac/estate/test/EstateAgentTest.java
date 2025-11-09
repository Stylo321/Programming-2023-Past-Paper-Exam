/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.estate.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import za.ac.estate.EstateAgent;

public class EstateAgentTest {

    /**
     *
     */
    @Test
    public void CalculateTotalASales_ReturnsTotalSales() {
        EstateAgent ea = new EstateAgent();
        double[] joeSales = {800000.0, 150000.0, 200000.0};
        double expected = 1150000.0; // 800k + 150k + 200k
        double result = ea.EstateAgentSales(joeSales);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void CalculateTotalCommission_ReturnsCommission() {
        EstateAgent ea = new EstateAgent();
        double total = 1150000.0;
        double expectedCommission = total * 0.02; // 2%
        double result = ea.EstateAgentCommission(total);
        assertEquals(expectedCommission, result, 0.0001);
    }

    @Test
    public void TopAgent_ReturnsTopPosition() {
        EstateAgent ea = new EstateAgent();
        double[] totals = {1150000.0, 980000.0}; // Joe larger than Jane
        int expectedIndex = 0; // Joe
        int result = ea.TopEstateAgent(totals);
        assertEquals(expectedIndex, result);
    }
}
