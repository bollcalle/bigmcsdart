package menus;

//import utilities.UserInput;

public class Menu {

    public static void menu()  {


        String inputUser = UserInput.stringInput("Welcome to DART, your good old game rental system. \n" +
                "The competition has no steam to keep up! \n" +
                "Please specify your role by entering on of the \n" +
                "options given: \n\n" +
                "1. Enter M for Manager \n" +
                "2. Enter E for Employee \n" +
                "3. Enter C for Customer \n" +
                "4. Enter X to exit system");


        switch (inputUser) {
            case "E":
                EmployeeMenu.employeeMenu("E");
                break;

            case "C":
                CustomerMenu.customerMenu();
                break;

            case "M":
                ManagerMenu.managerMenu();
                break;

            case "X":
                UserInput.closeScanner(); //closes scanner then exits by reaching the end of main
                break;

            default:
                System.out.println("Please enter a valid option");
                menu();

                //The Menu calls Controller who then call the corresponding classes. Menu -> Controller -> other Classes
        }

    }
}

