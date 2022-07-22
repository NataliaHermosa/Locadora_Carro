package heranca;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return getNome() + " (" + getCpf() + ")";
	}

	public PessoaFisica(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf = cpf;
	}
	
	
}
