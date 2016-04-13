package ejercicio50;

import java.util.Scanner;

public class PalabrasOrdenInverso
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce frase: ");
		String cadena = sc.nextLine();
		sc.close();
		String[] palabras = cadena.split(" ");
		for (int i = palabras.length - 1; i >= 0; i--)
		{
			System.out.print(palabras[i] + " ");
		}
	}
}
