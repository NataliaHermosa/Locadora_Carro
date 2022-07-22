package herancaenum;

public class Bicicleta extends Veículo {
	private String tipoBicicleta;
	private boolean temRodinha;
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	public boolean isTemRodinha() {
		return temRodinha;
	}
	public void setTemRodinha(boolean temRodinha) {
		this.temRodinha = temRodinha;
	}
	public Bicicleta(int identificador, String fabricante, String modelo, int anoFabricacao, String tipoBicicleta, boolean temRodinha) {
		super();
		this.tipoBicicleta = tipoBicicleta;
		this.temRodinha = temRodinha;
		setIdentificador(identificador);
		setFabricante(fabricante);
		setModelo(modelo);
		setAnoFabricacao(anoFabricacao);
				
	}
	@Override
	public String toString() {
		return "Bicicleta [tipoBicicleta=" + tipoBicicleta + ", temRodinha=" + temRodinha + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
