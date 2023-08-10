import java.util.Scanner;
public class JourneyCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Speed and to Calculate Distance");
        double speed=scan.nextDouble();
        double time=scan.nextDouble();
        JourneyCalculatorApp journeyCalculator=new JourneyCalculatorApp();
        double distance =journeyCalculator.calculateDistance(speed,time);
        System.out.println(distance);
        
         

	}
}
