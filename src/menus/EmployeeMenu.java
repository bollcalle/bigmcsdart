package menus;

//import utilities.UserInput;
//import employee.RegisterGame;
//import employee.RemoveGame;
//import employee.RegisterCustomer;
//import employee.RemoveCustomer;
//import employee.RegisterAlbum;
//import employee.RemoveAlbum;

//import static customer.CustomerMenuOption.maxGames;

    public class EmployeeMenu {
        public static int totalRentProfit;
        public static void employeeMenu(String mainMenuOption){
            String password = UserInput.stringInput("Please enter Password:");
            String correctPassword = "password123";
            if (password.equals(correctPassword)) {
                int employeeMenuOption = UserInput.intInput("Employee Screen - Type one of the options below:\n" +
                        "1. Register a game\n" +
                        "2. Remove a game\n" +
                        "3. Register an album\n"+
                        "4. Remove an album\n" +
                        "5. Register a customer\n" +
                        "6. Remove a customer\n" +
                        "7. Show total rent profit\n" +
                        "8. View all games\n" +
                        "9. Return to Main Menu");
                UserInput.stringInput("");
                switch (employeeMenuOption) {
                    case 1:
                        RegisterGame.registerGame("");
                        break;

                    case 2:
                        RemoveGame.Game("");
                        break;

                    case 3:
                        RegisterAlbum.registerAlbum("");
                        break;

                    case 4:
                        RemoveAlbum.Album("");
                        break;

                    case 5:
                        RegisterCustomer.registerCustomer(UserInput.stringInput ("Enter name of customer:"));
                        break;

                    case 6:
                        RemoveCustomer.customer();
                        break;

                    case 7:
                        System.out.println("Total rent profit is: "+totalRentProfit);
                        break;

                    case 8:
                        for (int i = 0; i < maxGames;i++){

                            if(RegisterGame.arrayGames[i]==null){

                            }else{
                                System.out.println(RegisterGame.arrayGames[i]);
                            }
                        }
                        break;
                    case 9:
                        Menu.menu();
                        break;

                    default:
                        System.out.print("Please enter a valid option: ");
                        menus.EmployeeMenu.employeeMenu("");
                }

            }
            else {
                System.out.println("Incorrect Password");
                Menu.menu();
            }
            Menu.menu();


        }
    }

}
