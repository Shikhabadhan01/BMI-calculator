import java.util.Scanner;

public class projectBMI {

    // Constructor
    public projectBMI() {
        displayWelcomeMessage();
    }

    public void displayChart() {
        System.out.println("\n--------------------BMI CATEGORY CHART------------------");
        System.out.println("               BMI Categories and their meaning");
        System.out.println("--------------------------------------------------------");
        System.out.println("    BMI < 18.5                 : Underweight");
        System.out.println("    18.5 < = BMI < 24.9        : Normal weight");
        System.out.println("    25 < = BMI < 29.9          : Overweight");
        System.out.println("    BMI > = 30                 : Obese");
        System.out.println("--------------------------------------------------------");
    }
    // Function to get user input for weight and height
    public double[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------------------------------------------------------");

        System.out.print("\n    Enter your weight(+ve kgs) : ");
        double weight = sc.nextDouble();

        System.out.print("    Enter your height (cm)     : ");
        double height = sc.nextDouble();

        return new double[]{weight, height};
    }
     // Function to calculate BMI
     public double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height);
    }
    // Function to print BMI result
    public void printResult(double bmi) {
        String category;
        if (bmi < 18.5) {
            category = "Underweight!!\n\n    You should aim for a balanced diet\n";
        } else if (bmi < 24.9) {
            category = "Normal weight \n\n    Great job! Keep maintaining a healthy lifestyle.\n";
        } else if (bmi < 29.9) {
            category = "Overweight \n\n    Consider a balanced diet & physical activities.\n";
        } else {
            category = "Obese \n\n    It's recommended to a consult Doctor.\n";
        }
    
        String formattedBMI = String.format("%.7f", bmi);
        System.out.println("\n--------------------------------------------------------");
        System.out.println("\n    Your BMI                   : " + formattedBMI);
        System.out.println("\n    Your Category              : " + category);
    }

    public void displayWelcomeMessage() {
        System.out.println("\n---------------------BMI CALCULATOR---------------------");
        System.out.println("\n            Welcome to the BMI Calculator!");
        System.out.println("   This calculator will help you determine your Body");
        System.out.println("   Mass Index (BMI) based on your weight and height.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        projectBMI bmiCal = new projectBMI();
        bmiCal.displayChart();
        
        System.out.println("\n    1. Calculate your BMI");
        System.out.println("    2. Exit");
        System.out.print("\n    Enter your choice (1 or 2) : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            double[] userInput = bmiCal.getUserInput();
            double weight = userInput[0];
            double height = userInput[1];

            double bmi = bmiCal.calculateBMI(weight, height);
            bmiCal.printResult(bmi);

        } else if (choice == 2) {
            System.out.println("\n--------------------------------------------------------");
            System.out.println("\nTHANK YOU for using BMI calculator!!\n");
            return;
        }
    }
}