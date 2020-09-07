import java.util.Scanner;
 
class StudentDesks {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int classA = scanner.nextInt();
       int classB = scanner.nextInt();
       int classC = scanner.nextInt();
       int deskA, deskB, deskC;
 
       /*
        *  your code goes here
        */

 
       if (classA % 2 == 1){
         deskA = (classA / 2) + 1;
       } else {
         deskA = classA / 2;
       }

       if (classB % 2 == 1){
         deskB = (classB / 2) + 1;
       } else {
         deskB = classB / 2;
       }

       if (classC % 2 == 1){
         deskC = (classC / 2) + 1;
       } else {
         deskC = classC / 2;
       }

       int totalDesk = deskA + deskB + deskC;
 
       System.out.print(totalDesk);
 
       // closing the scanner object
       scanner.close();
   }
}
