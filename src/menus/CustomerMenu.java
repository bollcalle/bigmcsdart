
    package menus;

//import customer.CustomerMenuOption;
//import utilities.UserInput;

    public class CustomerMenu {


        public static void customerMenu() {
            int a = UserInput.intInput("Type one of the options below:\n" +
                    "1. Rent a game\n" +
                    "2. Return a game\n" +
                    "3. Rent an album\n"+
                    "4. Return an album\n"+
                    "5. Return to Main Menu");



            switch (a) {
                case 1 :
                    //CustomerMenuOption.rentGame();
                    break;

                case 2 :
                    //CustomerMenuOption.returnGame();
                    break;

                case 3 :
                    //CustomerMenuOption.rentAlbum();
                    break;

                case 4 :
                    // CustomerMenuOption.returnAlbum();
                    break;

                case 5:
                    Menu.menu();
                    break;

                default:
            }
        }
    }
}
