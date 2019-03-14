package desafio;

import java.util.Scanner;

public class Task2 {

	private static char[] p;
	private static int contador = 0;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Digite um numero");
		String text = s.next();

		permuta(toArrayChar(text));

		s.close();
		System.out.print("Quantidade = " + contador);
	}

	public static char[] toArrayChar(String numero) {
		char v[] = new char[numero.length()];
		for (int i = 0; i < numero.length(); i++) {
			v[i] = numero.charAt(i);
		}
		return v;
	}

	public static void permuta(char[] vet) {

		p = new char[vet.length];
		permuta(vet, 0);
	}

	private static void permuta(char[] vet, int n) {

		if (n == vet.length) {

//			if (isZeroLeft())
				imprimir();

		} else {

			for (int i = 0; i < vet.length; i++) {

				boolean achou = false;

				for (int j = 0; j < n; j++) {

					if (p[j] == vet[i])
						achou = true;
				}

				if (!achou) {

					p[n] = vet[i];
					permuta(vet, n + 1);
				}
			}
		}
	}

	private static Boolean isZeroLeft() {
		char numero = p[0];
		if (numero == '0')
			return false;
		return true;
	}

	private static void imprimir() {
		contador++;
		System.out.println();
		for (int i = 0; i < p.length; i++)
			System.out.print(p[i] + " ");
	}
}
