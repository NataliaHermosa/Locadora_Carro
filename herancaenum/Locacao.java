package herancaenum;

import heranca.Pessoa;

public class Locacao {
	private Ve�culo veiculoAlugado;
	private Pessoa cliente;
	private String dataInicio;
	private String dataFim;
	
	public Ve�culo getVeiculoAlugado() {
		return veiculoAlugado;
	}
	public void setVeiculoAlugado(Ve�culo veiculoAlugado) {
		this.veiculoAlugado = veiculoAlugado;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public Locacao(Ve�culo veiculoAlugado, Pessoa cliente, String dataInicio, String dataFim) {
		super();
		this.veiculoAlugado = veiculoAlugado;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	@Override
	public String toString() {
		String resultado = "Dados da loca��o:\n";
	    resultado = resultado + "Cliente: " + cliente + "\n";
		resultado = resultado + "Ve�culo: " + veiculoAlugado + "\n";
		resultado = resultado + "Data in�cio: " + dataInicio + "\n";
		resultado = resultado + "Data fim: " + dataFim + "\n";
		
		return resultado;  		
		
	}
	
	
	

}
