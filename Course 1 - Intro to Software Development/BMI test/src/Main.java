public class Main {
    public static void main(String[] args) {
        double weight = 0;
        double height = 0;
        double bmi = 0;
        String system;
        String category;

        BMICalculator calculator = new BMICalculator();
        UserInput userInput = new UserInput();

        system = userInput.obtainBMISystem();
        switch (system.toUpperCase()) {
            // The case of IMPERIAL BMI system
            case "IMPERIAL":
                // Please invoke the obtainWeight() method of the UserInput class and assign it to the variable weight
                weight =userInput.obtainWeight(system);
                // Please invoke the obtainHeight() method of the UserInput class and assign it to the variable height
                height =userInput.obtainHeight(system);
                // Please invoke the calculateBmiImperial() method of the BMICalculator class
                bmi= calculator.imperialBmi(weight,height);
                // Break out of the switch statement
                break;
            // The case of METRIC BMI system
            case "METRIC":
                // Please invoke the obtainWeight() method of the UserInput class and assign it to the variable weight
                weight=userInput.obtainWeight(system);
                // Please invoke the obtainHeight() method of the UserInput class and assign it to the variable height
                height =userInput.obtainHeight(system);
                // Please invoke the calculateBmiMetric() method of the BMICalculator class
                bmi=calculator.metricBmi(weight,height);
                // Break out of the switch statement
                break;
            // The case of empty BMI system due to invalid user input
            default:
                // Please display a message asking the user to enter a valid BMI system in case of invalid input
                System.out.println("Please Enter a valid BMI System as input");
                // Break out of the switch statement
                break;
        }
        System.out.println("Your BMI is: " + bmi);
        category=calculator.bmiCategory(bmi);
        System.out.println("Your BMI category is: " + category);


    }
}
