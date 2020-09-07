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
      
       int differenceH = hours2 - hours1;
       int differenceM = minutes2 - minutes1;
       int differenceS = seconds2 - seconds1;
 
       int convertH = differenceH * 3600;
       int convertM = differenceM * 60;
 
       int totalDifference = convertH + convertM + differenceS;
 
       System.out.print(totalDifference);
       // closing the scanner object
       scanner.close();
   }
}
