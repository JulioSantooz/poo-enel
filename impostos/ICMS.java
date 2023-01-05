package AppEnel.impostos;

/**
 * @author Julio Santos
*/

public enum ICMS {
	
	RESIDENCIAL_RURAL(0.00f),
	RESIDENCIAL_RURAL_91(0.12f),
	RESIDENCIAL_RURAL_200(0.25f),
	PUBLICO(0.10f),
	OUTROS(0.18f);
	
	private float icms;
	
	ICMS(float imp) {
		this.icms = imp;
	}
	
	public float getIcms() {
		return icms;
	}
	
	public void setIcms(float icms) {
		this.icms = icms;
	}

}
