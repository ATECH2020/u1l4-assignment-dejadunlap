import java.util.Scanner;
 
class AnalogClock {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int degree = scanner.nextInt();
 
       /*
        *  your code goes here
        */
        int hour = degree / 30;
        int remainder = degree % 30; 
 
        double minutes = (remainder/30.0) * 60;
 
        double minutesDegree = minutes * 6;
 
        System.out.print(minutesDegree);
 
       // closing the scanner object
       scanner.close();
   }
}

