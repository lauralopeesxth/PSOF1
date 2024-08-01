package programacao_backend;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		System.out.println("informe um numero inteiro: ");
		int num1 = sc.nextInt();
		
		System.out.println("informe outro numero inteiro: ");
		int num2 = sc.nextInt();
		
		System.out.println("A soma entre eles resulta em: "+(num1+num2));

	}

}
