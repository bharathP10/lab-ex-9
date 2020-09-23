/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

/**
 *
 * @author BHARATH sharan
 */
public class exceptionhandling {public static void main(String[] args) {
        
        exception obj=new exception();
        obj.arithmetic();
        obj.arrayhandling();
        obj.numberhandling();
        obj.stringhandling();
        
    }
    
}
class exception
{
    void arithmetic()
    {
        try
        {
            int a=10/0;
        }
        catch( ArithmeticException z)
        {
           System.out.println(z);
            
        }
            
     }
      void arrayhandling()
    {
        try
        {
            int b[]=new int [2];
            b[10]=2;
        }
        catch(ArrayIndexOutOfBoundsException z)
        {
            System.out.println(z);
        }
    
   
    }
void numberhandling()
    {
        try
        {
            String str="BHARATH";
            int num=Integer.parseInt(str);
        }
        catch(NumberFormatException z)
        {
                 System.out.println(z);   
        }
    }
    
 void stringhandling()
    {
        try
        {
            String str="BHARATH";
            char ch=str.charAt(-1);
        }
        catch(StringIndexOutOfBoundsException z)
        {
            System.out.println(z);   
        }
    }
}
