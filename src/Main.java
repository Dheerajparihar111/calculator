import java.util.Scanner;

class home{
    void home(){
        System.out.println("Enter Your Choice");
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");
        System.out.println("*");
        System.out.println("%");
        System.out.println("EXIT");
    }
}

public class Main{
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        home homePage = new home();
        while (true) {
            System.out.println("*************Wel-Come to Calculator************");
            System.out.println("Enter the Number");
            int number1 = sc.nextInt();
            homePage.home();
            char operator = sc.next().charAt(0);
            System.out.println("Enter the Number");
            int number2 = sc.nextInt();

            switch (operator) {
                case '+':
                    System.out.println("Result =" + (number1 + number2));
                    break;
                case '-':
                    System.out.println("Result =" + (number1 - number2));
                    break;
                case '*':
                    System.out.println("Result =" + (number1 * number2));
                    break;
                case '/':
                    if (number1 == 0) {
                        System.out.println("Invalid!!");
                    } else if (number2 == 0) {
                        System.out.println("Invalid!!");

                    } else {
                        System.out.println("Result" + (number1 / number2));
                    }
                    break;
                case '%':
                    System.out.println("Result" + (number1 % number2));
                    break;
                case 'e':
                    System.out.println("Thank You For Using Calculator");
                    System.exit(0);

            }
        }


    }
}