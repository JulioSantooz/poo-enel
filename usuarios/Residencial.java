package AppEnel.usuarios;

import AppEnel.impostos.ICMS;
import AppEnel.regras_negocio.Tarifa;

/**
 * @author Julio Santos
*/

public class Residencial extends Contribuinte {
	
	public Residencial(int consumo) {
		super(consumo);
		super.setTarifa(Tarifa.RESIDENCIAL);
		this.setICMS();
	}
	
	public final void setICMS() {
		int consumo = getConsumo();
		if(consumo <= 90)
			icms = ICMS.RESIDENCIAL_RURAL;
		else if(consumo <= 200)
			icms = ICMS.RESIDENCIAL_RURAL_91;
		else 
			icms = ICMS.RESIDENCIAL_RURAL_200;
	}
	
	@Override
	public void emitirBoleto() {
		System.out.println("*** USUÁRIO RESIDENCIAL ***");
		super.emitirBoleto();
	}
	
	@Override
	public String toString() {
		String saida = "*** USUÁRIO RESIDENCIAL ***\n";
		saida += super.toString();
		return saida;
	}

}
