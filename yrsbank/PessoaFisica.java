package yrsbank;

public class PessoaFisica extends PessoaHeranca { //extends puxa da classe m�e
	
	private String cpf;
	private String rg;
	private String profissao;
	
	//construtor	
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String cpf, String rg, String profissao) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}
	
	//encapsulamento
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
}
