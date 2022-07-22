package herancaenum;

public class Trator extends Veículo {
	private TipoTrator categoria;

	public TipoTrator getCategoria() {
		return categoria;
	}

	public void setCategoria(TipoTrator categoria) {
		this.categoria = categoria;
	}

	public Trator(int identificador, String fabricante, String modelo, int anoFabricacao, TipoTrator categoria) {
		super();
		this.categoria = categoria;
		setIdentificador(identificador);
		setFabricante(fabricante);
		setModelo(modelo);
		setAnoFabricacao(anoFabricacao);
	}

	@Override
	public String toString() {
		return "Trator [categoria=" + categoria + ", toString()=" + super.toString() + "]";
	}

	
	}
	
	


