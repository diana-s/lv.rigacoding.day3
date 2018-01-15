package lv.rigacoding.day3;


import java.io.InputStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana
 */
public class SpeedCalculator {
    public SpeedCalculator(){
        
               
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadiet attālumu metros ");
        int distance = input.nextInt();
        
        Scanner input1 = new Scanner(System.in);
        System.out.print("Ievadiet laiku: stundas ");
        int hours = input.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.print("Ievadiet laiku: minūtes ");
        int minutes = input.nextInt();
        if(minutes>60){ System.out.print("Ievadīta nepareiza vērtība");return;}
        
        Scanner input3 = new Scanner(System.in);
        System.out.print("Ievadiet laiku: sekundes ");
        int seconds = input.nextInt();              
        if(seconds>60){ System.out.print("Ievadīta nepareiza vērtība");return;}
        
        
        int totalSeconds = getTotalTimeSeconds(hours, minutes, seconds);
        double totalSpeed = getTotalSpeed(distance, totalSeconds);
        double SpeedKMH = getSmeedKm(distance, totalSeconds);
        int miles = getMiles(distance);
        
                
               
    }
    
    
     public int getTotalTimeSeconds(int hours, int minutes, int seconds){
         int totalSeconds = hours*3600+minutes*60+seconds;
         System.out.println("Kopējais laiks sekundēs = " + totalSeconds + " sekundes");
         return totalSeconds;
         
         
     }
     
     public int getTotalSpeed(int distance, int totalSeconds){
         //int totalSpeed = distance/totalSeconds;
         //Lai notiktu dalīšana ar decimālskaitļiem, tad janorada, ka visi mainīgie ir decimālskaitļi, tapēc:
         double totalSpeed = (double) distance/(double) totalSeconds;
         System.out.println("Jūsu ātrums ir "+ totalSpeed+" m/s");
        return totalSeconds;
        
         
    
}
     public double getSmeedKm(int distance, int totalSeconds){
         double SpeedKMH = (distance/1000)/(totalSeconds/(60*60));
         System.out.println("Kopējais ātrums "+ SpeedKMH +" km/h");
         return SpeedKMH;
                            
        }
     
     public int getMiles (int distance){
         int miles = (int) (distance/1000*0.621371);
         System.out.println("Attālums jūdzēs ir "+ miles+".");
         return miles;
         
     }
}
