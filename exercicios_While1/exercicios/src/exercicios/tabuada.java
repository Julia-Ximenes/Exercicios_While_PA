package exercicios;

import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	int n, multi, i = 0;
	System.out.println("digite um número inteiro");
	n = ler.nextInt();
	while(i<=10) {
		
		multi = n*i;
		
		System.out.println(n+"x"+i+"="+multi);
		i++;
	}
 }
}
