import java.util.Scanner;
public class UserInput {
    Scanner scanner = new Scanner(System.in);
    public String obtainBMISystem(){
        String system;
        System.out.println("welcome to BMI Calculator");
        System.out.println("please enter your BMI calculation system (Imperial/Metric");
        system = scanner.nextLine();
        return system;
    }
    public double obtainWeight(String system){
        double weight = 0;
        switch(system){
            case "imperial":
                System.out.println("please enter your weight in pounds");
                weight = scanner.nextDouble();
                break;
            case "metric":
                System.out.println("please enter your weight in kilograms");
                weight = scanner.nextDouble();
                break;
                default:
                    System.out.println("please enter a valid calculation system");
        }
        return weight;

    }
    public double obtainHeight(String system){
        double height = 0;
        switch(system.toUpperCase()){
            case "IMPERIAL":
                System.out.println("please enter your height in inches");
                height = scanner.nextDouble();
                break;
                case "METRIC":
                    System.out.println("please enter your height in metres");
                    height = scanner.nextDouble();
                    break;
                    default:
                        System.out.println("please enter a valid calculation system");
                        break;
        }
        return height;
    }
}