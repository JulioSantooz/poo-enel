package AppEnel.usuarios;

import AppEnel.impostos.Impostos;

/**
 * @author Julio Santos
*/

public class Contribuinte extends Usuario implements Impostos {
	
	public Contribuinte() {
		super();
	}
	
	public Contribuinte(int consumo) {
		super(consumo);
	}
	
	public float getICMS() {
		return getValorBase() * icms.getIcms();
	}

	@Override
	public float getPIS() {
		return getValorBase() * PIS;
	}

	@Override
	public float getCOFINS() {
		return getValorBase() * COFINS;
	}

	@Override
	public float getCOSIP() {
		return COSIP;
	}

	@Override
	public float getTotalImpostos() {
		return getPIS() + getCOFINS() + getCOSIP() + getICMS();
	}
	
	public float getTotal() {
		return getValorBase() + getTotalImpostos();
	}
	
	// Emitindo boleto para interface de 'texto'.
	@Override
	public void emitirBoleto() {
		super.emitirBoleto();
		System.out.println();
		System.out.printf("ICMS (%.2f%%)          R$ %.2f%n",
				icms.getIcms() * 100, getICMS());
		System.out.printf("PIS (%.2f%%)           R$ %.2f%n",
				PIS * 100, getPIS());
		System.out.printf("COFINS (%.2f%%)        R$ %.2f%n",
				COFINS * 100, getCOFINS());
		System.out.printf("COSIP                  R$ %.2f%n",
				getCOSIP());
		System.out.printf("Total de Impostos      R$ %.2f%n",
				getTotalImpostos());
		System.out.printf("Total Devido           R$ %.2f%n",
				getTotal());
	}
	
	// Emitindo boleto para qualquer 'interface'.
	@Override 
	public String toString(){
		String saida = super.toString();
		String ICMS = String.format("ICMS (%.2f%%)          R$ %.2f%n",
				icms.getIcms() * 100, getICMS());
		String pis = String.format("PIS (%.2f%%)           R$ %.2f%n",
				PIS * 100, getPIS());
		String cofins = String.format("COFINS (%.2f%%)        R$ %.2f%n",
				COFINS * 100, getCOFINS());
		String cosip = String.format("COSIP                  R$ %.2f%n",
				getCOSIP());
		String impostos = String.format("Total de Impostos      R$ %.2f%n",
				getCOSIP());
		String total = String.format("Total Devido           R$ %.2f%n",
				getTotal());
		saida += ICMS + pis + cofins + cosip + impostos + total;
		return saida;
	}

}
