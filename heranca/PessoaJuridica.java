package heranca;

public class PessoaJuridica extends Pessoa{
	public PessoaJuridica(String nome, String endereco) {
		super(nome, endereco);
		
	}

	private String cnpj;
	private PessoaFisica responsavel;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public PessoaFisica getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}
	
	public String toString() {
		return getNome() + "(" + getCnpj() + ") - Responsável: " + getResponsavel().toString();
	}
	

}
