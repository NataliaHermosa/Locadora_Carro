package herancaenum;

import java.util.ArrayList;

import heranca.Pessoa;
import heranca.PessoaFisica;

public class Locadora {

	public static void main(String[] args) {
		
	ArrayList<Pessoa> pessoas = new ArrayList<>();	
    ArrayList<Veículo> veiculos = new ArrayList<>();
    
    pessoas.add(new PessoaFisica("natalia", "rua do sossego", "01104458733"));
    pessoas.add(new PessoaFisica("Isa", "rua do sossego", "24458732511"));
    
    veiculos.add(new CarroDePasseio(424, "Toyota", "Etios", 2022, "KLC 4077", 
    		"94KJFHGURHGFJR", 
    		TipoCombustivel.Flex, 
    		TipoCambio.Manual, 
    		TipoCarroPasseio.Hatch, 5));
    veiculos.add(new CarroDePasseio(232, "Renaut", "Sandero", 2018, "KPP 5088",
    		"90jfhrhgutrhg",
    		TipoCombustivel.Gasolina,
    		TipoCambio.Automatico,
    		TipoCarroPasseio.Hatch, 5));
    
    Locacao locacao = new Locacao(veiculos.get(1), pessoas.get(0), "06/07/2022", "08/07/2022");
    System.out.println(locacao); 
	}

}
