package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "carlos@gmail.com", "Carlos da Silva");
		Pessoa p2 = new Pessoa(2, "amanda@gmail.com", "Amanda Lima");
		Pessoa p3 = new Pessoa(3, "ana@gmail.com", "Ana Maria");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		}

}
