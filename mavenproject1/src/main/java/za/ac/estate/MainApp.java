/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.estate;

public class MainApp {
    public static void main(String[] args) {
        String[] agents = {"Joe Bloggs", "Jane Doe"};

        // 2D array: rows = agents, cols = months (JAN, FEB, MAR)
        double[][] propertySales = {
            {800000.0, 150000.0, 200000.0}, // Joe Bloggs
            {700000.0, 120000.0, 160000.0}  // Jane Doe
        };

        EstateAgent ea = new EstateAgent();
        double[] totals = new double[agents.length];
        double[] commissions = new double[agents.length];

        System.out.println("ESTATE AGENTS SALES REPORT");
        System.out.println("                      JAN              FEB              MAR");
        System.out.println("---------------------------------------------------------------");

        // Print rows and calculate totals
        for (int i = 0; i < agents.length; i++) {
            System.out.printf("%-15s", agents[i]);
            for (int j = 0; j < propertySales[i].length; j++) {
                System.out.printf("    R%,12.1f", propertySales[i][j]); // formatted with comma grouping
            }
            totals[i] = ea.EstateAgentSales(propertySales[i]);
            commissions[i] = ea.EstateAgentCommission(totals[i]);
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < agents.length; i++) {
            System.out.printf("Total Property for %s = R%,.1f%n", agents[i], totals[i]);
            System.out.printf("Sales commission for %s = R%,.1f%n", agents[i], commissions[i]);
            System.out.println();
        }

        int topIndex = ea.TopEstateAgent(totals);
        String topAgent = (topIndex >= 0) ? agents[topIndex] : "N/A";
        System.out.println("Top Performing estate agent: " + topAgent);
    }
}
