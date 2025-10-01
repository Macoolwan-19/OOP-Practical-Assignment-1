
import java.util.Scanner;

public class App {
    public static void main(String[] args){
   //in this code, im going to demonstrate division by zero error

   Scanner keyboardin = new Scanner(System.in);

   System.out.print("enter first number: ");
   int num1 = keyboardin.nextInt();
   
   int num2 = 0;

   try {
    int answer = num1 / num2;
    System.out.println(answer);
       
   } catch (Exception e) {

    System.out.println("DivisionByZeroException"+e);

   }




    }
}
