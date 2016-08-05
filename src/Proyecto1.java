import java.util.Scanner;

public class Proyecto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lea = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int numero = lea.nextInt();
		
		if(numero > 10){
			System.out.println("El numero es mayor que 10");
		}
		else{
			System.out.print("El numero es menor que 10");
		}
	}
}
