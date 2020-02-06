import java.util.Scanner;

public class ValidacionEnteros {
	public static void main (String [] args) {
		
		Scanner valor1 = new Scanner(System.in);
		Scanner valor2 = new Scanner(System.in);
		
		int val1, val2;
		
		System.out.println("Ingrese su primer numero: \n");
		val1 = valor1.nextInt();
		System.out.println("Ingrese su segundo numero: \n");
		val2 = valor2.nextInt();
		
		if(val1 > 21 && val2 > 21) {
			System.out.println(0);
		}else if(val1 > val2 && val1 <= 21) {
			System.out.println(val1);			
		}else if(val2 > val1 && val2 <= 21) {
			System.out.println(val2);			
		}
		
		
	}

}
