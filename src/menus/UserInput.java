package menus;

import java.util.Scanner;
//doubleInput for double, intInput for int, charInput for char, and stringInput for String.
//call the function like this: int i = Utilities.userInput.intInput("message to user");

    public class UserInput {
        public static Scanner input = new Scanner(System.in);

        public static double doubleInput(String message){
            System.out.println(message);
            double returnDouble = input.nextDouble();
            return returnDouble;
        }
        public static String stringInput(String message){
            if(message!=null){System.out.println(message);}
            String returnString = input.nextLine();
            return returnString;
        }
        public static int intInput(String message){
            System.out.println(message);
            int returnInt = input.nextInt();
            return returnInt;
        }
        public static char charInput(String message){
            System.out.println(message);
            char returnChar = input.next().charAt(0);
            return returnChar;
        }
        public static Long longInput(String message) {
            System.out.println(message);
            Long returnLong = input.nextLong();
            return returnLong;
        }
        public static void closeScanner(){
            input.close();
        }


    }

}
