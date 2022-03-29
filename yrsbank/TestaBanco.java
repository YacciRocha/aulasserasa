package yrsbank;

public class TestaBanco {

	public static void main(String[] args) {
//		
//		//com m�todo construtor sem parametro	
//		Pessoa pessoaNova = new Pessoa(); // instanciar a classe Pessoa		
//		pessoaNova.setNome("Jos� das Couves");		
//		System.out.println("Nome: " + pessoaNova.getNome());
//		
//		//com m�todo construtor com parametros
//		Pessoa pessoaComConstrutor1=new Pessoa("J�ao dos Tomates","143.771.430-77","33.018.191-9" );		
//		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
//		System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
//		System.out.println("RG: " + pessoaComConstrutor1.getRg());
		
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		//conta1.setSaldo(1000000.50); >>> n�o se deve alterar diretamente essa informa��o.Ela apenas pode ser exibida
		conta1.setTitular("Yacci Rocha");
		
		conta1.depositar(10000.0);
		
		System.out.println("Ag�ncia: " + conta1.getAgencia());
		System.out.println("Conta:" + conta1.getNumeroConta());
		System.out.println("Titular:" + conta1.getTitular());
		
		System.out.printf("Saldo atual:R$ %.2f \n" , conta1.getSaldo());// formata��o das casas decimais
		
		if(conta1.sacar(20.5)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Saque n�o efetuado, verifique o saldo.");			
		}
		
		System.out.printf("Saldo atual:R$ %.2f \n" ,conta1.getSaldo());
		
		//Criando outra conta
		
		Conta conta2=new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		
		if(conta1.transfeir(1500, conta2)) {
			System.out.println("Transfer�ncia efetuada com sucesso!");
		}else {
			System.out.println("Tranfer�ncia n�o efetuada, verifique o saldo.");			
		}
		
		//conta1.transfeir(1500, conta2);
		
		System.out.printf("Saldo atual Yacci:R$ %.2f \n" ,conta1.getSaldo());
		System.out.printf("Saldo atual Jo�o:R$ %.2f \n" ,conta2.getSaldo());
		
	}
	
}
