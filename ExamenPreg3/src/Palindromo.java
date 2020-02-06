import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.print("Ingresa el texto \n");
        String escrito = texto.nextLine();
        
        int fin = escrito.length()-1;
        int inicio=0;
        boolean validacion = true;
        
        if(escrito.length()>50) {
        	System.out.print("No se pueden validar textos que superen los 50 caracteres");        	
        }else {
        while(inicio < fin){
            if(escrito.charAt(inicio)!=escrito.charAt(fin)){
                validacion=false;
            }
        inicio++;
        fin--;
        }
        
        
        if(validacion) {
            System.out.print("Si");
        }else {
            System.out.print("No");
        }        
    }
}
}
