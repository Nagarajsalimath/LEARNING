import java.util.Scanner;
public class TheDoubleTroubleApp {

	public static void main(String[] args) {
		Scanner Scan =new Scanner(System.in);
		System.out.println("double the number");
		int num=Scan.nextInt();
		System.out.println(doubleTheNumber(num));
		
		}
	
		public static int doubleTheNumber(int num)
		{
			return num*2;
		}
	}


