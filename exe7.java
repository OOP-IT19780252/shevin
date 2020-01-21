import java.util.Scanner;
class exe7
{
   
    public static void main(String[] args) {
        
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter the amount in LKR");
          int amt=scanner.nextInt();
         Double US$,Pounds,Euros;
         

         US$=amt/182.26;
         Pounds=amt/222.74;
         Euros=amt/206.36;
         System.out.println(amt+" LKR = "+US$+"$");
         System.out.println(amt+" LKR = "+Pounds+" Pounds");
         System.out.println(amt+" LKR = "+Euros+" Euros");

         

          



        

        
    }
}