package heranca;

public class Programa {

	public static void main(String[] args) {
		PessoaFisica natalia = new PessoaFisica("natalia hermosa", "01107714435","rua prof. marly figueredo");
				
		PessoaJuridica pj = new PessoaJuridica(null, null);
		pj.setNome("churrascaria");
		pj.setEndereco("rua do sossego, s/n");
		pj.setCnpj("1215548545/0001-98");		
        pj.setResponsavel(natalia);
        
        System.out.println("o responsável pela empresa é " + pj.getResponsavel().getNome());
	}

}
