package com.dts.core.program;

import java.util.HashMap;
import java.util.Map;

public class WarehouseTracking {
    // Define the known locations of the Wi-Fi access points in the warehouse
    static Map<String, double[]> accessPoints = new HashMap<>();
    static {
        accessPoints.put("AP1", new double[]{0, 0});
        accessPoints.put("AP2", new double[]{5, 0});
        accessPoints.put("AP3", new double[]{0, 5});
    }

    public static double[] triangulate(Map<String, Integer> signalStrengths) {
        // Given the signal strengths from the three access points, calculate the estimated location of the forklift
        double d1 = Math.pow(10, (-signalStrengths.get("AP1") / 20.0));  // convert signal strength to distance
        double d2 = Math.pow(10, (-signalStrengths.get("AP2") / 20.0));
        double d3 = Math.pow(10, (-signalStrengths.get("AP3") / 20.0));

        double[] ap1 = accessPoints.get("AP1");
        double[] ap2 = accessPoints.get("AP2");
        double[] ap3 = accessPoints.get("AP3");

        // Calculate the coordinates of the intersection of the three circles
        double A = 2 * (ap2[0] - ap1[0]);
        double B = 2 * (ap2[1] - ap1[1]);
        double C = d1 * d1 - d2 * d2 - ap1[0] * ap1[0] + ap2[0] * ap2[0] - ap1[1] * ap1[1] + ap2[1] * ap2[1];
        double D = 2 * (ap3[0] - ap2[0]);
        double E = 2 * (ap3[1] - ap2[1]);
        double F = d2 * d2 - d3 * d3 - ap2[0] * ap2[0] + ap3[0] * ap3[0] - ap2[1] * ap2[1] + ap3[1] * ap3[1];

        double x = (C * E - F * B) / (E * A - B * D);
        double y = (C * D - A * F) / (B * D - A * E);

        // Return the estimated location of the forklift as an array of [x, y] coordinates
        return new double[]{x, y};
    }

    // Example usage of the triangulate() function
    public static void main(String[] args) {
        Map<String, Integer> signalStrengths = new HashMap<>();
        signalStrengths.put("AP1", -50);
        signalStrengths.put("AP2", -70);
        signalStrengths.put("AP3", -60);
        double[] estimatedLocation = triangulate(signalStrengths);
        System.out.printf("Estimated location: (%.2f, %.2f)\n", estimatedLocation[0], estimatedLocation[1]);
    }
}
