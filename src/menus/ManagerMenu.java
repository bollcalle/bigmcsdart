package menus;

//import manager.ManageEmployee;
//import utilities.UserInput;

public class ManagerMenu {
    public static void managerMenu() {
        String password = UserInput.stringInput("Please enter Password:");
        String correctPassword = "admin123";
        if (password.equals(correctPassword)) {
            ManagerMenu.passwordChecked();
        } else {
            System.out.println("Incorrect Password");
            Menu.menu();
        }
    }
    public static void passwordChecked() {
        int inputUser = UserInput.intInput("Manager Screen - Type one of the options below:" +
                "\n1. Add an employee"+
                "\n2. View all employees & salary cost"+
                "\n3. Remove an employee"+
                "\n4. Return to Main Menu");
        UserInput.stringInput("");
        switch (inputUser) {
            case 1 :
                ManageEmployee.addEmployee();
                break;
            case 2 :
                ManageEmployee.viewEmployee();
                break;
            case 3 :
                int ID = UserInput.intInput("Enter the ID of the employee you want to remove");
                ManageEmployee.removeEmployee(ID);
                break;
            case 4:
                Menu.menu();
                break;
            default: {
                System.out.println("Please enter a valid number");
                passwordChecked();
            }
        }
    }
}