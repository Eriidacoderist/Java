package program;

public class App {

    private final String AthleteName;

    private final String trainingPlan;

    private final double kilograms;

    private final String weightCat;

    private final double comp;

    private final int coachingHours;

    private final double totalCost;

    public App(String AthleteName, String trainingPlan, double kilograms, String weightCat, double comp, int coachingHours, double totalCost) {
        this.AthleteName = AthleteName;

        this.trainingPlan = trainingPlan;

        this.kilograms = kilograms;

        this.weightCat = weightCat;

        this.comp = comp;

        this.coachingHours = coachingHours;

        this.totalCost = totalCost;
    }

    public String getName() {
        return AthleteName;
    }

    public String gettrainingPlan() {
        return trainingPlan;
    }

    public double getkilograms() {
        return kilograms;
    }

    public String getweightCat() {
        return weightCat;
    }

    public double getcomp() {
        return comp;
    }

    public int getcoachingHours() {
        return coachingHours;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String toString() {
        return "╔═══════════════════════════════════════════════════╗" +
               "\n║                                               ║" +
               "\n║ Name:\t\t\t" + AthleteName +
               "\n║ Training Plan:\t\t" + trainingPlan +
               "\n║ Weight:\t\t" + kilograms +
               "\n║ Weight Category:\t" + weightCat +
               "\n║ Competition Entry:\t" + comp +
               "\n║ Coaching Hours:\t" + coachingHours +
               "\n║ Total Cost:\t\t" + "$" + totalCost +
               "\n║                                               ║" +
               "\n╚═══════════════════════════════════════════════════╝";
     }
}
