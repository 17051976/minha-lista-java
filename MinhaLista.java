package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MinhaLista {
	
	Scanner teclado = new Scanner(System.in);
	
	private String text;
	private String remover;
	
	private ArrayList<String> lista = new ArrayList<String>();	
	
	public void setText() {
		
		while(true) {
			
			System.out.print("Digite um nome: ");
			text = teclado.next();
			
			if (existText(text)) {
				System.out.println("O nome " + text + " já existe!");
			    System.out.println("Escolha outro nome.");
			}
			else {
				System.out.println("O nome " + text + " adicionado com sucesso!");
				lista.add(text);
				
				System.out.print("Deseja adicionar, mais algum? ");
			    String opt3 = teclado.next();
			    
				if (("sim").equalsIgnoreCase(opt3)) {
					continue;
				}
				System.out.print(" ");
				System.out.print("Sua lista");
				System.out.print(lista);
				break;
			}
		}
	}
	public void setRemover() {
	    
		while(true) {
			
			System.out.println("Nome que deseja remover: ");
			remover = teclado.next();
			
			if(existRemover(remover)) {
				System.out.print("O nome '" + remover + "' foi removido com sucesso!");
				
				System.out.print("Deseja remover mais algum? ");
				String opc4 = teclado.next();
					    
				if (("sim").equalsIgnoreCase(opc4)) {
					    continue;
					    }			
				System.out.print(" ");
				System.out.print("Sua lista");
				System.out.print(lista);
				break;
			}
			else {
				System.out.println("O nome '" + remover + "' não encontrado!");
			    System.out.println("Escolha outro nome.");
			}
		}
	}
	public void list() {
	    System.out.println("Sua lista: ");
	    System.out.println(lista);

	}
	public boolean existText(String text) {
		Iterator<String> it = lista.iterator();
		System.out.println(" ");
	
			while (it.hasNext()) {	
				String item = it.next();
				if(item.equalsIgnoreCase(text)) {
					return true;
					}
			    }
			return false;
	}
	public boolean existRemover(String remover) {
		Iterator<String> it = lista.iterator();
				
				while (it.hasNext()) {
					
					String item = it.next();
					
					if(item.equalsIgnoreCase(remover)) {
						it.remove();
						return true;
					}
				}
				return false;
	}
}
