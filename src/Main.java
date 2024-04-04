
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Midterm :");
        int midterm = scanner.nextInt();
        System.out.print("Midterm2 :");
        int midterm2 = scanner.nextInt();
        System.out.print("Final :");
        int finalnot = scanner.nextInt();
        System.out.print("Your overall :");
        
        
        double overall = scanner.nextDouble();
        double totalnot = (midterm * 3 / 10.0) + (midterm2 * 3 / 10.0) + (finalnot * 4 / 10.0);
        
        if (totalnot >= 90){
            System.out.println("You got AA..");
      
        }
        else if (totalnot >= 85 ){
            System.out.println("You got BA..");
        }
        else if (totalnot >= 80 ){
            System.out.println("You got BB..");
        }
        else if (totalnot >= 75 ){
            System.out.println("You got CB..");
        }
        else if (totalnot >= 70 ){
            System.out.println("You got CC..");
        }
        else if (totalnot >= 65 ){
            System.out.println("You got DC..");
        }
        else if (totalnot >= 60 ){
            System.out.println("You got DD..");
            
            if (overall < 2.5){
                
                System.out.println("You got DD and your overall is low, you need retake..");
            }
        }
        else{
            System.out.println("You got FF and failed exam..");
        }


        
        
        
    }
    
}
