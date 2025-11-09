/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.estate;

public class EstateAgent implements IEstateAgent {

    // 1) Sum the monthly property sales for one agent
    @Override
    public double EstateAgentSales(double[] propertySales) {
        double total = 0.0;
        for (double sale : propertySales) {
            total += sale;
        }
        return total;
    }

    // 2) Commission calculation: 2% of total sales (0.02)
    @Override
    public double EstateAgentCommission(double totalSales) {
        return totalSales * 0.02;
    }

    // 3) Return index of the top performing agent (first occurrence of max)
    @Override
    public int TopEstateAgent(double[] totalSales) {
        if (totalSales == null || totalSales.length == 0) return -1;
        double max = totalSales[0];
        int idx = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > max) {
                max = totalSales[i];
                idx = i;
            }
        }
        return idx;
    }
}
