/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.estate;

public interface IEstateAgent {
    // Calculate total sales for a single agent (sum of monthly property sales)
    double EstateAgentSales(double[] propertySales);

    // Calculate commission for a single agent (takes total sales and returns commission)
    double EstateAgentCommission(double totalSales);

    // Return the index (position) of the top performing estate agent in the totalSales array
    int TopEstateAgent(double[] totalSales);
}
