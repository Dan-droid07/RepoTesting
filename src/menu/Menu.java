package menu;

import java.util.Scanner;


public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean condition = false;
        while (condition != true)
        {
            System.out.println("**********************************");
            System.out.println("1. Option");
            System.out.println("2. Option");
            System.out.println("3. Option");
            System.out.println("4. Exit");
            System.out.println("**********************************");
            
            Scanner imput = new Scanner(System.in);
            int option = imput.nextInt();
            
            switch (option) {
                case 1:
                {
                    System.out.println("You typed Option 1");
                    System.out.println();
                    break;
                }
                case 2:
                {
                    System.out.println("You typed Option 2");
                    System.out.println();
                    break;
                }
                case 3:
                {
                    System.out.println("You typed Option 3");
                    System.out.println();
                    break;
                }
                case 4:
                {
                    System.out.println("Exit");
                    condition = true;
                    break;
                }      
                default:
                    break;
            }
        }
    }
}
