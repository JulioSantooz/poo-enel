package AppEnel.regras_negocio;

/**
 * @author Julio Santos
*/

public enum Tarifa {
	
	RESIDENCIAL(0.00f, 0.00f),
	SOCIAL_000_030(0.65f, 0.72f),
	SOCIAL_031_100(0.40f, 0.50f),
	SOCIAL_101_220(0.10f, 0.30f),
	SOCIAL_221(0.00f, 0.25f),
	RURAL(0.20f, 0.30f),
	PUBLICO(0.40f, 0.40f),
	OUTROS(0.00f, 0.00f);
	
	Tarifa(float descTE, float descTU) {
		TE = TE_PLENA * (1 - descTE);
		TUSD = TUSD_PLENA * (1 - descTU);
	}
	
	private final float TE_PLENA = 0.25588f;
	private final float TUSD_PLENA = 0.25971f;
	private final float TE;
	private final float TUSD;
	
	public float getTE() {
		return TE;
	}
	
	public float getTUSD() {
		return TUSD;
	}

}
