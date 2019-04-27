/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2604;

/**
 *
 * @author general
 */
public class Programacion2604 
{

    /**
     * @param args the command line arguments
     */
    public static int mayor_entre3(int num1,int num2, int num3)
    {
       int mayor = 0;
       
       if(num1 > num2)
       {
           if(num1 > num3)
           {
               //num1 > num2 y num1 > num3
               mayor = num1;
           }
           else
           {
               //num1 > num2  num3 > num1
               mayor = num3;
           }
       }
       else
           //num2 > num1
           if(num2 > num3)
           {
               //num2 > num1 y num2 > num3
               mayor = num2;
           }
           else
           {
              //num2 > num1 y num3 > num2 
               mayor = num3;
           }    
        return mayor;
    }
    
     
        
    public static void main(String[] args)
    { 
        System.out.println( mayor_entre3(15,12,9));
        System.out.println( mayor_entre3(15,21,9));
        System.out.println( mayor_entre3(5,12,9));
        System.out.println( mayor_entre3(3,4,9));
    } 
}   

