import java.util.Scanner;
 
class SecondsPastMidnight {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads int from user
       int seconds = scanner.nextInt();
 
       //Your code goes here
       int hours = seconds / 3600; //hours since midnight
       int minutes = seconds / 60; //minutes since midnight
 
       System.out.print(hours + " " + minutes);
       // closing the scanner object
       scanner.close();
   }
}
