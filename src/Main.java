import java.util.Scanner;

class home{
    void home(){
        System.out.println("Enter Your Choice In Integer Please");
        System.out.println("1) +");
        System.out.println("2) -");
        System.out.println("3) *");
        System.out.println("4) /");
        System.out.println("5) %");
    }
}

public class Main{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        home homePage = new home();
        System.out.println("*************Wel-Come to Calculator************");
        while (true) {
            System.out.println("Enter The First Value");
            int number1 = input.nextInt();
            homePage.home();
            int operator = input.nextInt();
            System.out.println("Enter the Second  Number");
            int number2 = input.nextInt();

            switch (operator) {
                case 1:
                    System.out.println("Result =" + (number1 + number2));
                    break;
                case 2:
                    System.out.println("Result =" + (number1 - number2));
                    break;
                case 3:
                    System.out.println("Result =" + (number1 * number2));
                    break;
                case 4:
                    if (number2 == 0) {
                        System.out.println("Invalid!! Cannot Divide By Zero ");
                    }
                    else {
                        System.out.println("Result =" + (number1 / number2));
                    }
                    break;
                case 5:
                    System.out.println("Result =" + (number1 % number2));
                    break;

            }
            System.out.println("Do You Want To Exit Calculator");
            System.out.println(" 1) Yes OR 2) No");
            int quitOption = input.nextInt();
            if (quitOption == 1){
                System.out.println("Thank You For Using Calculator");
                System.exit(0);
            }else {
                continue;
            }
        }


    }
}