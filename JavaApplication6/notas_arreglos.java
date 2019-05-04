/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.io.*;
/**
 *
 * @author general
 */
public class notas_arreglos
{
   public static void main(String[] args){
       BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));  
       try
       {
           int estudiantes = Integer.parseInt(br.readLine());
           double[] notas_arreglos = new double[estudiantes];
           double min = 5.0, max = 0.0, prom = 0.0;
           
           //Recibir notas
           for(int i = 0; i < estudiantes; i++){
               notas_arreglos[i] = Double.parseDouble(br.readLine());
           }    
           for(int i = 0; i < estudiantes; i++){
               if(notas_arreglos[i] < min){
                   min = notas_arreglos[i];
               }
               if(notas_arreglos[i] > max){
                   max = notas_arreglos[i];
               }
               prom = prom + notas_arreglos[i];
           }
           prom = prom / estudiantes;
           bw.write("la nota maxima fue " + max +
                    ", la nota minima fue " + min +
                    ", y el promedio fue " + prom);
           bw.flush();
       }
      catch(Exception ex); {}
       
   }   

