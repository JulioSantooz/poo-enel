package AppEnel.usuarios;

import AppEnel.impostos.ICMS;
import AppEnel.regras_negocio.Tarifa;

/**
 * @author Julio Santos
*/

public class BaixaRenda extends Contribuinte {
	
	public BaixaRenda(int consumo) {
		super.setConsumo(consumo);
		this.setTarifa();
		super.setIcms(ICMS.RESIDENCIAL_RURAL);
	}
	
	public final void setTarifa() {
		int consumo = getConsumo();
		if(consumo <= 30)
			tarifa = Tarifa.SOCIAL_000_030;
		else if(consumo <= 100)
			tarifa = Tarifa.SOCIAL_031_100;
		else if(consumo <= 220)
			tarifa = Tarifa.SOCIAL_101_220;
		else 
			tarifa = Tarifa.SOCIAL_221;
	}
	
	@Override
	public void emitirBoleto() {
		System.out.println("*** USUÁRIO BAIXA RENDA ***");
		super.emitirBoleto();
	}
	
	@Override
	public String toString() {
		String saida = "*** USUÁRIO BAIXA RENDA ***\n";
		saida += super.toString();
		return saida;
	}

}
