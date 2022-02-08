package entidades;

public class Terceirizado extends Funcionario{
	
	private Double taxaAdicional;
	
	public Terceirizado() {
		super();
	}

	public Terceirizado(String nome, Integer horas, Double valorPorHora, Double taxaAdicional) {
		super(nome, horas, valorPorHora);
		this.taxaAdicional = taxaAdicional;
	}

	public Double getTaxaAdicional() {
		return taxaAdicional;
	}

	public void setTaxaAdicional(Double taxaAdicional) {
		this.taxaAdicional = taxaAdicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + taxaAdicional * 1.1;
	}

}
