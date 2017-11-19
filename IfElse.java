import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		for( int i=0; i<10;i++){
			x=scan.nextInt();
			if(x%2==0)
				System.out.println(x+" is an even number.");
			else
				System.out.println(x+" is an odd number.");
		}
	}

}
