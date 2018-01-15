/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day3;

import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class TemperatureCalculator {
    
     
    
    public TemperatureCalculator(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadiet temperatūra ");
        int temperature = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        System.out.print("Ievadiet temperatūras mērvienību C vai F: ");
        char measure =input1.next().charAt(0);
          
           
        
        if (measure =='C'||measure =='c'){  
            ConverterC(temperature);
           
        } 
        else if(measure !='C'){
            ConverterF(temperature);
        }
                   
    }
    
    private void ConverterC(int temperature){
        double CtoF = (double)temperature*1.8+32;
        System.out.println("Jūsu ievadīta temperatūra pēc Farenheita skalas = "+CtoF);
               
    }
    private void ConverterF(int temperature){
        double FtoC = ((double)temperature-32)*5/9;
        System.out.println("Jūsu ievadīta temperatūra pēc Celsija skalas = "+FtoC);
}
}

