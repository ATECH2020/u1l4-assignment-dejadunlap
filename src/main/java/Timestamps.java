import java.util.Scanner;
 
class Timestamps {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int hours1 = scanner.nextInt();
       int minutes1 = scanner.nextInt();
       int seconds1 = scanner.nextInt();
       int hours2 = scanner.nextInt();
       int minutes2 = scanner.nextInt();
       int seconds2 = scanner.nextInt();
 
       /*
        *  your code goes here
        */
       
    
       int convertH1 = hours1 * 3600;
       int convertH2 = hours2 * 3600;
       int convertM1 = minutes1 * 60;
       int convertM2 = minutes2 * 60;
    
       int differenceH = convertH2 - convertH1;
       int differenceM = convertM2 - convertM1;
       int differenceS = seconds2 - seconds1;
 
 
       int totalDifference = differenceH + differenceM + differenceS;
 
       System.out.print(totalDifference);
       // closing the scanner object
       scanner.close();
   }
}
