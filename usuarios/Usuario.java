package AppEnel.usuarios;

import AppEnel.impostos.ICMS;
import AppEnel.regras_negocio.Cobranca;
import AppEnel.regras_negocio.Tarifa;

/**
 * @author Julio Santos
*/

public abstract class Usuario implements Cobranca{
	
	private int consumo;
	protected Tarifa tarifa;
	protected ICMS icms;
	
	public Usuario() {
		this.consumo = MINIMO;
	}
	
	public Usuario(int consumo) {
		this.consumo = (consumo < MINIMO) ? MINIMO: consumo;
	}
	
	public int getConsumo() {
		return this.consumo;
	}
	
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	public float getTarifa() {
		return tarifa.getTE() + tarifa.getTUSD();
	}
	
	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}
	
	public float getIcms() {
		return icms.getIcms();
	}
	
	public void setIcms(ICMS icms) {
		this.icms = icms;
	}
	
	@Override
	public float getValorBase() {
		return getConsumo() * getTarifa();
	}
	
	// Emitindo boleto para interface de 'texto'.
	@Override
	public void emitirBoleto() {
		System.out.println("*** CONTA DE LUZ *** Enel ***\n");
		System.out.println("Consumo (kwh): "+this.getConsumo());
		System.out.printf("Tarifa de Energia  R$ %.5f %n ",
				tarifa.getTE());
		System.out.printf("Distribuição      R$ %.5f %n ",
				tarifa.getTUSD());
		System.out.printf("Valor Base        R$ %.5f %n ",
				this.getValorBase());
	}
	
	// Emitindo boleto para qualquer 'interface'.
	@Override 
	public String toString() {
		String saida = "*** CONTA DE LUZ ***\n*** Enel ***";
		saida += "\nConsumo (kwh): "+getConsumo();
		String TE = String.format("\nTarifa de Energia R$ %.5f %n ",
				tarifa.getTE());
		String TUSD = String.format("Distribuição      R$ %.5f %n ",
				tarifa.getTUSD());
		String base = String.format("Valor base        R$ %.5f %n ",
				this.getValorBase());
		saida += TE + TUSD + base;
		return saida;
	}

}
