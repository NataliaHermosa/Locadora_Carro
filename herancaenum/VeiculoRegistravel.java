package herancaenum;

public class VeiculoRegistravel extends Ve�culo {
	private String placa;
	private String chassis;
	private TipoCombustivel combust�vel;
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
	public TipoCombustivel getCombust�vel() {
		return combust�vel;
	}
	public void setCombust�vel(TipoCombustivel combust�vel) {
		this.combust�vel = combust�vel;
	}
	public TipoCambio getCambio() {
		return cambio;
	}
	public void setCambio(TipoCambio cambio) {
		this.cambio = cambio;
	}
	@Override
	public String toString() {
		return "VeiculoRegistravel [placa=" + placa + ", chassis=" + chassis + ", combust�vel=" + combust�vel
				+ ", cambio=" + cambio + ", toString()=" + super.toString() + "]";
	}	
	
	

}
