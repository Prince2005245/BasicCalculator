package GitHub_Work.BasicCalculator;
import java.util.Scanner;

public class Calculator {    
public static void main(String[] args) {
    int ans;
    System.out.println("Calculator");
    System.out.print("What is your first number: ");
    Scanner MyVar = new Scanner (System.in);
    int SN = MyVar.nextInt();
    System.out.print("What is your second number: ");
    Scanner MyVat = new Scanner (System.in);
    int SM = MyVat.nextInt();
    System.out.println("What operation would you like to do");
    System.out.println("Type 1 for addition");
    System.out.println("Type 2 for subtraction");
    System.out.println("Type 3 for division");
    System.out.println("Type 4 for multiplication");
    Scanner MyVah = new Scanner (System.in);
    int op = MyVah.nextInt();
    if (op == 1) {
        System.out.println("You chose addition");
        ans = SN + SM;
        System.out.println("The sum of " + SN + " and " + SM + " is " + ans);
      }
    else if (op == 2){
        System.out.println("You have chose Subtraction");
        ans = SN - SM;
        System.out.println("The difference between " + SN + " and " + SM + " is " + ans);
      }
    else if (op == 3){
        System.out.println("You chose division");
        ans = SN / SM;
        System.out.println("The sum of " + SN + " and " + SM + " is " + ans);
      }
    else if (op == 4){
        System.out.println("You chose multiplication");
        ans = SN * SM;
        System.out.println(" The sum of " + SN + " and " + SM + " is " + ans);
        MyVah.close();
        MyVar.close();
        MyVat.close();
    }
  }    
}
