package AppEnel.usuarios;

import AppEnel.impostos.ICMS;
import AppEnel.regras_negocio.Tarifa;

/**
 * @author Julio Santos
*/

public class Rural extends Contribuinte {
	
	public Rural(int consumo) {
		super(consumo);
		super.setTarifa(Tarifa.RURAL);
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
		System.out.println("*** USUÁRIO RURAL ***");
		super.emitirBoleto();
	}
	
	@Override
	public String toString() {
		String saida = "*** USUÁRIO RURAL ***\n";
		saida += super.toString();
		return saida;
	}

}
