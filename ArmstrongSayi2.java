import java.util.Scanner;
public class ArmstrongSayi2 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        System.out.print("Say� Giriniz :");
	        int number = input.nextInt();
	        int basNumber = 0;
	        int tempNumber = number;
	        int basValue;
	        int result = 0;
	        int basPow;

	        while (tempNumber != 0) {
	            tempNumber /= 10;
	            basNumber++;
	        }

	        tempNumber = number;
	        while (tempNumber != 0) {
	            basValue = tempNumber % 10;
	            // 1*1*1*1 = 1^4
	            basPow = 1;
	            for (int i = 1; i <= basNumber; i++) {
	                basPow *= basValue;
	            }
	            result += basPow;
	            tempNumber /= 10;
	        }

	        if (result == number) {
	            System.out.println(number + " say�s� bir Armstrong say�d�r.");
	        } else {
	            System.out.println(number + " say�s� bir Armstrong say�s� de�ildir.");
	        }

	}

}
