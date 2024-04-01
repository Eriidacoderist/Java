package program;

import java.util.*;

public class northsussexjudo {
        public static ArrayList<App> athletelist = new ArrayList<App>();

        public static void main(String[] args) {

            String AthleteName = null, trainingPlan = null, weightCat = null;
            Double kilograms = 0d, comp = 0d, totalCost = 0d;
            int coachingHours = 0, choice = 3;
            Scanner scan = new Scanner(System.in);

            do {
                TrainingProgram.menuTxt();
                boolean validChoice = false;
                while (!validChoice) {
                    try {
                        choice = scan.nextInt();
                        if (choice >= 1 && choice <= 3) {
                            validChoice = true;
                        } else {
                            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.print("Invalid input. Please enter a Input: ");
                        scan.next();
                    }
                }
                scan.nextLine();
                if (choice == 1) {
                    // ENTER NAME
                    while (true) 
            {
                System.out.println("");
                System.out.print("Enter Athlete's Name: ");
                AthleteName = scan.nextLine();

                if (AthleteName.matches("[A-Za-z ]+") && AthleteName.length() > 1) 
                {
                    break;
                } else 
                {
                    System.out.println("Invalid input. Please enter a valid name.");
                }
            }
            System.out.println("");
                    // ENTER TRAINING PLAN
                    System.out.println("=================================");
                    System.out.println("Training Plans:");
                    System.out.println("1. Beginner (2 sessions per week) - weekly fee $25.00");
                    System.out.println("2. Intermediate (3 sessions per week) - weekly fee $30.00");
                    System.out.println("3. Elite (5 sessions per week) - weekly fee $35.00");
                    
                        while (true) {
                            System.out.println("Please Enter a Training Plan Based on the list: ");
                            trainingPlan = scan.nextLine();
                            if (trainingPlan.equalsIgnoreCase("beginner")
                                    || trainingPlan.equalsIgnoreCase("Intermediate")
                                    || trainingPlan.equalsIgnoreCase("Elite")) {
                                break;
                        } else {
                            System.out.println("Please enter a valid training plan");
                            System.out.println("");
                        }     
                    }
                    System.out.println("");
                    // ENTER WEIGHT (KG)
                    System.out.println("=================================");
                    System.out.print("Enter Athlete's Kilogram: ");
                    kilograms = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Heavyweight\tUnlimited(over 100)");
                    System.out.println("Light-Heavyweight\t100");
                    System.out.println("Middleweight\t90");
                    System.out.println("Light-Middleweight\t81");
                    System.out.println("Lightweight\t73");
                    System.out.println("Flyweight\t66");
                    System.out.print("Enter Athlete's Weight category: ");

                    while (true) {
                        try {
                            weightCat = scan.nextLine();
                            if (weightCat.equalsIgnoreCase("flyweight") ||
                                    weightCat.equalsIgnoreCase("lightweight") ||
                                    weightCat.equalsIgnoreCase("light-middleweight") ||
                                    weightCat.equalsIgnoreCase("middleweight") ||
                                    weightCat.equalsIgnoreCase("light-heavyweight") ||
                                    weightCat.equalsIgnoreCase("heavyweight")) {
                                break;
                            } else {
                                System.out.println("Heavyweight\tUnlimited(over 100)");
                                System.out.println("Light-Heavyweight\t100");
                                System.out.println("Middleweight\t90");
                                System.out.println("Light-Middleweight\t81");
                                System.out.println("Lightweight\t73");
                                System.out.println("Flyweight\t66");
                                System.out.println("Please enter weight category based on the list:");
                            }
                        } catch (Exception e) {
                           System.out.println("Please enter weight category based on the list:");
                        }
                    }
                System.out.println("");
                    // ENTER COMPETITION IF THE TRAINING PLAN IS BEGINNER THE ATHLETE IS NOT ALLOW
                    // TO
                    if (trainingPlan.equalsIgnoreCase("Beginner")) {
                        comp = 0d;
                    } else {
                        System.out.print("Number of Competition You Want to Enter: ");
                        while (true) {
                            comp = scan.nextDouble();
                            try {
                                if (comp >= 0) {
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Please Enter Number of Competition:");
                            }
                        }
                    }
                    System.out.println("");
                    // COACHING HOURS
                    System.out.println("=================================");
                    System.out.print("Private Coaching Hours ($9 per hour): ");
                    while (true) {
                        coachingHours = scan.nextInt();
                        try {
                            if (coachingHours >= 0 && coachingHours <= 5) {
                                break;
                            } else {
                                System.out.println("5 hours is the maximum time allowed");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Please Number of Hours:");
                        }
                    }
                    System.out.print("Enter Coaching Hours: ");
                    coachingHours = scan.nextInt();
                    System.out.println("=================================");
                    totalCost = TrainingProgram.calculatetotalcost(trainingPlan, comp, coachingHours);
                   
                    App athlete = new App(AthleteName, trainingPlan, kilograms, weightCat, comp, coachingHours,
                            totalCost);
                    athletelist.add(athlete);
                } else if (choice == 2) {
                    if (athletelist.isEmpty()) {
                        System.out.println("================================");
                        System.out.println("The record is empty");
                        System.out.println("================================");
                    } else {
                        TrainingProgram.displayAthleteInfo(athletelist);
                    }
                }

            } while (choice < 3);
        }

    }
