package exercicios;

import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	int idade, i = 1;
	while(i<7) {
		System.out.println("digite a idade da "+i+"a. pessoa");
		idade = ler.nextInt();
		if (idade<18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		i++;
	}
 }
}
