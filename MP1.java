import java.util.Scanner;
public class MP1{



    public static void main(String[] args) {
        // Create new Calculator object
        Calculator mycalc = new Calculator();
        mycalc.setname("Group 36");
        // Loop over unless 'Q' is input
        while(true){
            Scanner scanner = new Scanner(System.in);
            // Welcome statement
            System.out.println("Welcome to the Calculator designed by " + mycalc.getname() + ".");
            System.out.println("Enter A to Add, S to Subtract, M to Multiply, and Q to quit.");
            // Grab input
            String operation = scanner.nextLine();
            // Quit
            if(operation.equals("Q")){
                System.exit(0);
            }
            // Check if non valid operation was entered
            while(!operation.equals("A") && !operation.equals("S") && !operation.equals("M") && !operation.equals("Q")) {
                System.out.println("Incorrect input, try again");
                System.out.println("Welcome to the Calculator designed by " + mycalc.getname() + ".");
                System.out.println("Enter A to Add, S to Subtract, M to Multiply, and Q to quit.");
                operation = scanner.nextLine();
                if(operation.equals("Q")){
                    System.exit(0);
                }
            }

            // Keeps track of if an error occured with the input or not
            boolean keepTrying = true;

            while(keepTrying){
                System.out.println("Enter argument 1");
                String arg1 = scanner.nextLine();
                System.out.println("Enter argument 2");
                String arg2 = scanner.nextLine();
                switch (operation){
                // Add
                case "A":
                    try{
                        System.out.println("The sum of argument 1 and 2 is " + mycalc.addition(Float.parseFloat(arg1), Float.parseFloat(arg2)));
                        keepTrying = false;
                        break;
                        }
                        catch (NumberFormatException e){
                            System.out.println("One of your arguments was formatted wrong, try again");
                            break;
                        }
                // Subtract
                case "S":
                    try{
                        System.out.println("The difference of argument 1 and 2 is " + mycalc.subtraction(Float.parseFloat(arg1), Float.parseFloat(arg2)));
                        keepTrying = false;
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("One of your arguments was formatted wrong, try again");
                        break;
                    }
                // Multiply
                case "M":
                    try{
                        System.out.println("The product of argument 1 and 2 is " + mycalc.multiplication(Float.parseFloat(arg1), Float.parseFloat(arg2)));
                        keepTrying = false;
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("One of your arguments was formatted wrong, try again");
                        break;
                    }
                // If for some reason we end up here something went very wrong
                default:
                    System.out.println("Something went wrong, try again");
                    break;
                }
            }
            // New line
            System.out.println("\n");
            
                
        }
        

    }
}
