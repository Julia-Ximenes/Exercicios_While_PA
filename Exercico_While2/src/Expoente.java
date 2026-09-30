import java.util.Scanner;
public class Expoente {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int base, i, expoente, resultado;
		
		resultado = 1;
		i = 1;
		
		System.out.println("Digite o valor da base: ");
		
		base = ler.nextInt();
		
		System.out.println("Digite o valor do expoente:")
		
		expoente= ler.nextInt();
		
		while (i <= expoente) {
			resultado = resultado*base;
			
			i++
		}

	}

}

