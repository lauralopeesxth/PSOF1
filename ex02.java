package programacao_backend;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double pi = 3.14159;
         Scanner sc = new Scanner (System.in);
         System.out.println("Qual o raio do circulo? ");
         double raio = sc.nextDouble();
         
         System.out.printf("A area do circulo é: %.4f ",pi*raio*raio );
	}

}
