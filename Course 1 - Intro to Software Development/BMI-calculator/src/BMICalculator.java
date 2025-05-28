public class BMICalculator {
    // Attributes (not needed for calculation, but kept for demonstration purposes)
    double weightInPounds;
    double heightInInches;
    double weightInKilos;
    double heightInMeters;

    // Constructor (no changes needed)
    public BMICalculator() {
        this.heightInInches = 1.0;
        this.weightInPounds = 1.0;
        this.heightInMeters = 1.0;
        this.weightInKilos = 1.0;
    }

    // Corrected method for Imperial BMI calculation
    public double calculateBmiImperial(double weight, double height) {
        return (703 * weight) / (height * height); // Use method parameters, not attributes
    }

    // Corrected method for Metric BMI calculation
    public double calculateBmiMetric(double weight, double height) {
        return weight / (height * height); // Use method parameters, not attributes
    }

    // Method to determine BMI category
    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
