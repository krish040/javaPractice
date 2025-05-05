
import java.util.Scanner;

public class HorseRace {

    public static double calculateTime(double avgSpeedKmph, int hurdles) {
        if (hurdles < 8 || hurdles > 13) {
            throw new IllegalArgumentException("Number of hurdles must be between 8 and 13.");
        }

        double totalDistance = 4.0; // in km
        double initialAccelTime = 30.0; // in seconds
        double avgSpeedDuringAccel = avgSpeedKmph / 2.0; // half speed during first 30 sec

        // Distance covered during acceleration phase
        double accelDistance = (avgSpeedDuringAccel * (initialAccelTime / 3600.0)); // in km

        // Remaining distance after acceleration
        double remainingDistance = totalDistance - accelDistance;

        // Distance of final boost
        double finalBoostDistance = 0.5; // 500 m in km
        double beforeBoostDistance = remainingDistance - finalBoostDistance;

        // Time for before boost section
        double timeBeforeBoost = (beforeBoostDistance / avgSpeedKmph) * 3600.0; // in seconds

        // Time for final boost section
        double boostedSpeed = avgSpeedKmph + 10;
        double timeFinalBoost = (finalBoostDistance / boostedSpeed) * 3600.0; // in seconds

        // Time lost due to hurdles: 15 sec per hurdle
        double hurdleTimeLoss = hurdles * 15;

        // Total time
        double totalTime = initialAccelTime + timeBeforeBoost + timeFinalBoost + hurdleTimeLoss;
        return totalTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter average speed of horse (in km/h): ");
        double avgSpeed = sc.nextDouble();

        System.out.print("Enter number of hurdles (between 8 to 13): ");
        int hurdles = sc.nextInt();

        try {
            double totalTime = calculateTime(avgSpeed, hurdles);
            System.out.printf("Time taken by the horse to complete the race: %.2f seconds\n", totalTime);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

