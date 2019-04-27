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
public class promedio 
{
    public static double promedio_entre_5(int n1,int n2, int n3, int n4, int n5)
    {        
            double promedio;
            promedio = (n1 + n2 + n3 + n4 + n5) / 5.0;
            
            return promedio;
    }   
    
    public static void main(String[] args)
    { 
        System.out.println( promedio_entre_5(5,5,5,5,5));
        System.out.println( promedio_entre_5(5,3,2,1,0));
        System.out.println( promedio_entre_5(1,2,4,3,5));
}

    
    
