public class BMICalculator {
    // Calculate BMI using the imperial system
    public double imperialBmi(double weightInPounds, double heightInInches) {
        // Correct formula for imperial BMI
        return (703 * weightInPounds) / (heightInInches * heightInInches);
    }

    // Calculate BMI using the metric system
    public double metricBmi(double weightInKg, double heightInMeters) {
        // Correct formula for metric BMI
        return weightInKg / (heightInMeters * heightInMeters);
    }

    // Determine BMI category
    public String bmiCategory(double bmi) {
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
