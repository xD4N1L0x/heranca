package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceirizado;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Entre com o número de funcionários: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados funcionário #"+i);
			System.out.print("Treceirizado (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			if(ch == 's') {
				System.out.print("Taxa adicional: ");
				Double taxaAdicional = sc.nextDouble();
				
				list.add(new Terceirizado(nome, horas, valorPorHora, taxaAdicional));
			}
			else {
				list.add(new Funcionario(nome, horas, valorPorHora));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for(Funcionario fun : list) {
			System.out.println(fun.getNome()+ " - R$ "+ String.format("%.2f", fun.pagamento()));
		}
		
		sc.close();
	}

}
