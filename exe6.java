
import java.util.Scanner;
class exe6
{
   
    public static void main(String[] args) {
        
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter the item name");
          String name=scanner.nextLine();
          System.out.println("Enter the unit price");
          Integer price=scanner.nextInt();
          System.out.println("Enter the quantity");
          Integer quantity=scanner.nextInt();

          int cost;
          cost=quantity*price;
          System.out.println("The cost will be "+cost+" rupees");



        

        
    }
}