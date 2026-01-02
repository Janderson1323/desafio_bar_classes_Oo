package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.printf("Sexo: ");
		bill.gender = sc.next().charAt(0);
		System.out.println("Quantidade de cervejas");
		bill.beer = sc.nextInt();
		System.out.println("Quantidade de regfrigerante");
		bill.softDrink = sc.nextInt();
		
		System.out.println("Quantidade de espetinhos");
		bill.barbecue = sc.nextInt();		

	}

}
