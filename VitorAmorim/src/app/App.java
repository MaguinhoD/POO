package app;
import java.util.*;
import main.AsciiArt;
import main.Controle;
import main.Menu;
import pessoa.Pessoa;

public class App {
	
	public static void main(String[] args) {
		
		AsciiArt.printAsciiArt("BANCADA FUNDO");
		Menu menu = new Menu();
		int op = 1000;
		while (op != 0) {
			menu.imprimirMenu();
			Controle ctl = new Controle();
			op = ctl.opcao();
			Controle x = new Controle();
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			
			switch (op) {
			case 1:
				System.out.println("Digite o nome do aluno:");
				
				//Pessoa a = new Pessoa(x.texto());
				//pessoas.add(a);
			
				break;
			
			case 2:
				
				for ( Pessoa i : pessoas) {
					System.out.println(i.getNome());					
				}
				break;
				
			case 0:
				break;
					
					
					
			default:
				menu.imprimirMenu();
				break;
			}
		}

	}
}
