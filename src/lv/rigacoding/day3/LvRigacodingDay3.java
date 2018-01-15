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
public class LvRigacodingDay3 {

    /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ievadiet skaitli A:");
        
        int a = input.nextInt();
        System.out.println("Jūs ievadijāt skaitli "+a);
               
    }
    //sistēma pirmo meklēs main funkciju, tapēc iepriekšējo nosaucam par main2
     public static void main3(String[] args){
         Scanner input = new Scanner (System.in);
         System.out.print("Ievadiet savu vārdu ");
         //Nolasi nākamo teksta fragmentu - izvadīt
         String vards = input.next();
         
         Scanner input2 = new Scanner (System.in);
         System.out.print("Ievadiet savu uzvārdu ");
         String uzvards = input.next();
         
         System.out.println("Tevi sauc "+vards+" "+uzvards);
         
     }
     
      public static void main4(String[] args){
      SpeedCalculator kalkulators = new SpeedCalculator();
      
      }
    public static void main(String[] args){
        TemperatureCalculator CorF = new TemperatureCalculator();
        
    }
    
}
