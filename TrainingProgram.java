package program;
import java.util.*;
    
    public class TrainingProgram {
        public static void displayAthleteInfo(ArrayList<App> athletelist) {
            for (App athlete : athletelist) {

                System.out.println(athlete);
            }
        }

        public static double calculatetotalcost(String trainingPlan, double comp, int coachingHours) {
            double trainingPlanCost = 0, compCost = 0, coachingHoursCost = 0, overallCost = 0;
            if (trainingPlan.equalsIgnoreCase("Beginner")) {
                trainingPlanCost = 25 * 4;
            } else if (trainingPlan.equalsIgnoreCase("Intermediate")) {
                trainingPlanCost = 30 * 4;
            } else if (trainingPlan.equalsIgnoreCase("Elite")) {
                trainingPlanCost = 35 * 4;
            }
            compCost = comp * 22;
            coachingHoursCost = coachingHours * 9 * 4;
            overallCost = trainingPlanCost + compCost + coachingHoursCost;

            return overallCost;
        }

        public static void menuTxt() {
                    System.out.println("                        ╔═══════════════════════════════════════════════════╗");
                    System.out.println("                        ║                MENU SELECT INPUT                  ║");
                    System.out.println("                        ║                                                   ║");
                    System.out.println("                        ║                 1. Add Student                    ║");
                    System.out.println("                        ║                                                   ║");
                    System.out.println("                        ║                 2. View list                      ║");
                    System.out.println("                        ║                                                   ║");
                    System.out.println("                        ║                 3. Exit                           ║");
                    System.out.println("                        ║                                                   ║");
                    System.out.println("                        ╚═══════════════════════════════════════════════════╝");
            System.out.print("Input Choice: ");
        }
    }
