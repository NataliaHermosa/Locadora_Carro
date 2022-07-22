package herancaenum;

public class CarroDePasseio extends VeiculoRegistravel {
	private TipoCarroPasseio categoria;
	private int qtdPassageiros;
	
	public TipoCarroPasseio getCategoria() {
		return categoria;
	}
	public void setCategoria(TipoCarroPasseio categoria) {
		this.categoria = categoria;
	}
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	public CarroDePasseio(int identificador, String fabricante, String modelo, 
		int anoFabricacao, String placa, String chassis, TipoCombustivel combustivel, 
		TipoCambio cambio, TipoCarroPasseio categoria, int qtdPassageiros) {
		super();
		this.categoria = categoria;
		this.qtdPassageiros = qtdPassageiros;
		
		setPlaca (placa);
		setChassis(chassis);
		setCombustível(combustivel);
		setCambio(cambio);
		
		setIdentificador(identificador);
		setFabricante(fabricante);
		setChassis (chassis);
		setAnoFabricacao(anoFabricacao);
	}
	@Override
	public String toString() {
		return "CarroDePasseio [categoria=" + categoria + ", qtdPassageiros=" + qtdPassageiros + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
