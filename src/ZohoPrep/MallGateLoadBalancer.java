package ZohoPrep;

import java.util.Arrays;

public class MallGateLoadBalancer {

    // Vehicle type indices
    private static final int BIKE  = 0;
    private static final int CAR   = 1;
    private static final int TRUCK = 2;
    private static final int BUS   = 3;
    private static final int AUTO  = 4;

    private static final String[] VEHICLE_NAMES = {
            "Bike", "Car", "Truck", "Bus", "Autorickshaw"
    };

    public static void main(String[] args) {

        int numGates = 5;
        int numTypes = VEHICLE_NAMES.length;

        // allowed[gate][type] = true if that gate can accept that vehicle type
        boolean[][] allowed = new boolean[numGates][numTypes];

        // Gate 1: bike, autorickshaw
        allowed[0][BIKE] = true;
        allowed[0][AUTO] = true;

        // Gate 2: car
        allowed[1][CAR] = true;

        // Gate 3: truck
        allowed[2][TRUCK] = true;

        // Gate 4: any vehicle
        Arrays.fill(allowed[3], true);

        // Gate 5: bike, truck
        allowed[4][BIKE] = true;
        allowed[4][TRUCK] = true;

        // Priority of gates for each vehicle type (indices are 0-based gates)
        int[][] gatePriority = new int[numTypes][];
        gatePriority[BIKE]  = new int[]{4, 0, 3};      // Gate5, then Gate1, then Gate4
        gatePriority[CAR]   = new int[]{1, 3};         // Gate2, then Gate4
        gatePriority[TRUCK] = new int[]{2, 4, 3};      // Gate3, then Gate5, then Gate4
        gatePriority[BUS]   = new int[]{3};            // Only Gate4
        gatePriority[AUTO]  = new int[]{0, 3};         // Gate1, then Gate4

        // How many of each type to process
        int[] vehicleCounts = new int[numTypes];
        vehicleCounts[BIKE]  = 100;
        vehicleCounts[CAR]   = 100;
        vehicleCounts[TRUCK] = 100;
        vehicleCounts[BUS]   = 100;
        vehicleCounts[AUTO]  = 100;

        // gateLoad[g] = total vehicles assigned to gate g
        int[] gateLoad = new int[numGates];

        // gateVehicleCount[g][t] = how many of vehicle type t went to gate g
        int[][] gateVehicleCount = new int[numGates][numTypes];

        int unassigned = 0;

        // Assign vehicles for each type
        for (int type = 0; type < numTypes; type++) {
            unassigned += assignVehiclesOfType(
                    type,
                    vehicleCounts[type],
                    allowed,
                    gatePriority,
                    gateLoad,
                    gateVehicleCount
            );
        }

        // Print results
        printResults(gateLoad, gateVehicleCount, unassigned);
    }

    /**
     * Assigns all vehicles of a given type to gates, based on allowed gates and priorities.
     * Always picks, among allowed priority gates, the one with the lowest current load.
     */
    private static int assignVehiclesOfType(
            int type,
            int count,
            boolean[][] allowed,
            int[][] gatePriority,
            int[] gateLoad,
            int[][] gateVehicleCount
    ) {
        int unassigned = 0;

        for (int i = 0; i < count; i++) {
            int chosenGate = -1;
            int bestLoad = Integer.MAX_VALUE;

            // Try gates in priority order
            for (int gate : gatePriority[type]) {
                if (allowed[gate][type]) {
                    if (gateLoad[gate] < bestLoad) {
                        bestLoad = gateLoad[gate];
                        chosenGate = gate;
                    }
                }
            }

            if (chosenGate == -1) {
                // Should not happen with your constraints, but let's be safe.
                unassigned++;
            } else {
                gateLoad[chosenGate]++;
                gateVehicleCount[chosenGate][type]++;
            }
        }

        return unassigned;
    }

    private static void printResults(int[] gateLoad, int[][] gateVehicleCount, int unassigned) {
        System.out.println("=== Gate Assignment Summary ===");

        for (int g = 0; g < gateLoad.length; g++) {
            System.out.println("Gate " + (g + 1) + " total: " + gateLoad[g]);
            for (int t = 0; t < VEHICLE_NAMES.length; t++) {
                int c = gateVehicleCount[g][t];
                if (c > 0) {
                    System.out.println("   " + VEHICLE_NAMES[t] + ": " + c);
                }
            }
        }

        System.out.println("\nUnassigned vehicles: " + unassigned);
    }
}
