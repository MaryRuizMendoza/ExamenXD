package com.softtek.principal;

import java.util.Scanner;

import com.softtek.operaciones.Division;
import com.softtek.operaciones.Multiplicacion;
import com.softtek.operaciones.Resta;
import com.softtek.operaciones.Suma;

public class operaciones {
	
	public static void main(String [] args) {
		Scanner test = new Scanner(System.in);
		System.out.println("ingrese el primer numero");
		int n1 = test.nextInt();
		System.out.println("ingrese el segundo numero numero");
		int n2 = test.nextInt();
		
		System.out.println("opciones de operaciones del programa:");
		System.out.println("Opcion [1] = Suma");
		System.out.println("Opcion [2] = Resta");
		System.out.println("Opcion [3] = Multiplicacion");
		System.out.println("Opcion [4] = Division");
		
		
		int operacion = test.nextInt();
		int resultado = 0;
		switch(operacion)
		{
			case 1:
				Suma sum = new Suma();
				sum.val1 = n1;
				sum.val2 = n2;
				resultado = sum.suma();
			System.out.println("El resultado de la suma es: \n" + resultado);
			break;
			
			case 2:
				Resta res =  new Resta();
				res.val1 = n1;
				res.val2 = n2;
				resultado = res.resta();
			System.out.println("El resultado de la resta es: \n" + resultado);			
			break;
			
			case 3:
				Multiplicacion mult = new Multiplicacion();
				mult.val1 = n1;
				mult.val2 = n2;
				resultado = mult.mult();
			System.out.println("El resultado de la multiplicacion es: \n"+resultado);
			break;
			
			case 4:
				Division div = new Division();
				div.val1 = n1;
				div.val2 = n2;
				resultado = div.division();
			System.out.println("El resultado de la division es: \n"+resultado);
			break;
		}
	}

}
