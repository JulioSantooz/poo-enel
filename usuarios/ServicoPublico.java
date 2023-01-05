package AppEnel.usuarios;

import AppEnel.impostos.ICMS;
import AppEnel.regras_negocio.Tarifa;

/**
 * @author Julio Santos
*/

public class ServicoPublico extends Contribuinte {
	
	public ServicoPublico(int consumo) {
		super(consumo);
		super.setTarifa(Tarifa.PUBLICO);
		super.setIcms(ICMS.PUBLICO);
	}
	
	@Override
	public void emitirBoleto() {
		System.out.println("*** USUÁRIO SERVIÇO PÚBLICO ***");
		super.emitirBoleto();
	}
	
	@Override
	public String toString() {
		String saida = "*** USUÁRIO SERVIÇO PÚBLICO ***\n";
		saida += super.toString();
		return saida;
	}

}
