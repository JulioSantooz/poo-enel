package AppEnel.usuarios;

import AppEnel.impostos.ICMS;
import AppEnel.regras_negocio.Tarifa;

/**
 * @author Julio Santos
*/

public class Outros extends Contribuinte {
	
	public Outros(int consumo) {
		super(consumo);
		super.setTarifa(Tarifa.OUTROS);
		super.setIcms(ICMS.OUTROS);
	}
	
	@Override
	public void emitirBoleto() {
		System.out.println("*** USUÁRIO OUTROS ***");
		super.emitirBoleto();
	}
	
	@Override
	public String toString() {
		String saida = "*** USUÁRIO OUTROS ***\n";
		saida += super.toString();
		return saida;
	}

}
