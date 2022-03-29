package yrsbank;

public class PessoaJuridica extends PessoaHeranca { //extends puxa da classe mãe

	private String cnpj;
	private String segmento;
	private String responsavel;
	
	//construtor	

	public PessoaJuridica() {
		super();
	}	
	
	public PessoaJuridica(String cnpj, String segmento, String responsavel) {
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.responsavel = responsavel;
	}

	//encapsulamento
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}	
	
}
