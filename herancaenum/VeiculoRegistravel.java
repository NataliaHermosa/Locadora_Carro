package herancaenum;

public class VeiculoRegistravel extends Veículo {
	private String placa;
	private String chassis;
	private TipoCombustivel combustível;
	private TipoCambio cambio;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassis() {
		return chassis;
	}
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	public TipoCombustivel getCombustível() {
		return combustível;
	}
	public void setCombustível(TipoCombustivel combustível) {
		this.combustível = combustível;
	}
	public TipoCambio getCambio() {
		return cambio;
	}
	public void setCambio(TipoCambio cambio) {
		this.cambio = cambio;
	}
	@Override
	public String toString() {
		return "VeiculoRegistravel [placa=" + placa + ", chassis=" + chassis + ", combustível=" + combustível
				+ ", cambio=" + cambio + ", toString()=" + super.toString() + "]";
	}	
	
	

}
