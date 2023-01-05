package AppEnel.regras_negocio;

/**
 * @author Julio Santos
*/

public interface Cobranca {
	
	// Valor minimo cobrado mensalmente
	// Concumo em KWh
	int MINIMO = 50;
	
	// Obrigatório: Mostrar o valor sem impostos
	public float getValorBase();
	// Obrigatório: Emitir um boleto de cobrança
	public void emitirBoleto();

}
