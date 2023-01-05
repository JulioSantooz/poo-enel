package AppEnel.app_enel;

import java.util.Scanner;
import AppEnel.usuarios.Residencial;
import AppEnel.usuarios.BaixaRenda;
import AppEnel.usuarios.Rural;
import AppEnel.usuarios.Usuario;
import AppEnel.usuarios.Outros;
import AppEnel.usuarios.ServicoPublico;

/**
 * @author Julio Santos
*/

public class AppEnel {
	
	public static void main(String[] args) {
		
		int consumo, opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Consumo (kwh): ");
		consumo = entrada.nextInt();
		
		System.out.println("Selecione o Usuário");
		System.out.println("1 - Residencial");
		System.out.println("2 - Residencial de Baixa Renda");
		System.out.println("3 - Rural");
		System.out.println("4 - Serviço Público");
		System.out.println("5 - Outros");
		opcao = entrada.nextInt();
		
		Usuario usuario;
		switch(opcao) {
			case 2: 
				usuario = new BaixaRenda(consumo);
				usuario.emitirBoleto();
				break;
			case 3: 
				usuario = new Rural(consumo);
				usuario.emitirBoleto();
				break;
			case 4: 
				usuario = new ServicoPublico(consumo);
				usuario.emitirBoleto();
				break;
			case 5: 
				usuario = new Outros(consumo);
				usuario.emitirBoleto();
				break;
			default: 
				usuario = new Residencial(consumo);
				usuario.emitirBoleto();
				break;
		}
		
		entrada.close();
		
	}

}
