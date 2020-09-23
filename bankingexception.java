/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.util.Scanner;

/**
 *
 * @author BHARATH sharan
 */

    

public class bankingexception { 
     public static void main(String[] args) {
     double a;
     int b;
     bankingexception obj=new  bankingexception();
      Scanner obj1=new Scanner(System.in);
     System.out.println("Enter your PIN ");
     b=obj1.nextInt();
     try
        {
            obj.checkpin(b);
        }
        catch(PinException ex)
         {
                 System.out.println("PLEASE contact Your branch immediately ");
                 System.out.println(ex.getMessage());
                  System.exit(0);
                 
         }
        
     System.out.println("Enter AMOUNT TO BE WITHDRAWN ");
     a=obj1.nextDouble();
     
        try
        {
            obj.check(a);
        }
        catch(MinimumBalanceException ex)
         {
                 System.out.println("There is no minimum balance ,your are exceeding the limit (10000)  ");
                 System.out.println(ex.getMessage());
                
         }
        
    } 
     class MinimumBalanceException extends Exception
         {
    
        public MinimumBalanceException(String s)
        {
            super(s);
        }
    
}
      class PinException extends Exception
      {
          private PinException(String s)
          {
              super(s);
          }
      }
      void checkpin (int b )throws PinException
    {
      if(b>=1000 && b<11111)
      {
           System.out.println(" Press Enter to select your amount to withdraw ");
      }
      else
      {
           throw new PinException("INCORRECT PIN!!!!!!!!!!");
       
           
      }
    }
    
    void check (double a )throws MinimumBalanceException
    {
      if(a>10000)
      {
          throw new MinimumBalanceException("Insufficient Balance...contact your branch");
      }
      else
      {
          System.out.println("YOUR AMOUNT will be withdrawn342 ...Please wait for PROCESSING ");
      }
    
}

}
