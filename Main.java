import java.util.*;
  
class Main {
  public static void main(String[] args) {
    Stack operators = new Stack();
    Stack operands = new Stack();

    Scanner input = new Scanner(System.in);
    while(true){
      System.out.print("Enter the expression: ");
      String expression = input.nextLine();
      if(expression.equals("END")){
        return;
      }
    }
  }
}