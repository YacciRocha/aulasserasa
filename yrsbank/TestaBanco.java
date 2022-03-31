package yrsbank;

public class TestaBanco {

	public static void main(String[] args) {
		
		/* //com m�todo construtor sem parametro	
		Pessoa pessoaNova = new Pessoa(); // instanciar a classe Pessoa		
		pessoaNova.setNome("Jos� das Couves");		
		System.out.println("Nome: " + pessoaNova.getNome());
		
		//com m�todo construtor com parametros
		Pessoa pessoaComConstrutor1=new Pessoa("J�ao dos Tomates","143.771.430-77","33.018.191-9" );		
		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
		System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
		System.out.println("RG: " + pessoaComConstrutor1.getRg()); */
		
		//--------------------------------------------------------------------------------
		PessoaFisica pfHeloisaHelena=new PessoaFisica();
		pfHeloisaHelena.setNome("Helo�sa Helena Rocha de Aguiar");
		pfHeloisaHelena.setEmail("email@gmail.com");
		pfHeloisaHelena.setTelefone("159789648");
		pfHeloisaHelena.setCpf("721.209.560-57");
		pfHeloisaHelena.setProfissao("Deselvolvedora");
		pfHeloisaHelena.setRg("20.490.331-2");
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setTitular(pfHeloisaHelena);
		
		//Depositar
		conta1.depositar(10000.0);
		
		System.out.println("Ag�ncia: " + conta1.getAgencia());
		System.out.println("Conta:" + conta1.getNumeroConta());
		System.out.println("Titular:" + conta1.getTitular().getNome());	
		System.out.println("Titular:" + conta1.getTitular().getEmail());	
		System.out.println("Titular:" + conta1.getTitular().getTelefone());	
		
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
		
		conta1.transfeir(1500, conta2);		
		System.out.printf("Saldo atual Yacci:R$ %.2f \n" ,conta1.getSaldo());
		System.out.printf("Saldo atual Jo�o:R$ %.2f \n" ,conta2.getSaldo());
		
		//transferencia
		if(conta1.transfeir(1500, conta2)) {
			System.out.println("Transfer�ncia efetuada com sucesso!");
		}else {
			System.out.println("Tranfer�ncia n�o efetuada, verifique o saldo.");			
		}
		
		
		/*---------------------------------------------------------------------------*/ 
		
		System.out.println("___________--------_____________");
		
		
		ContaCorrente cc1= new ContaCorrente();
		cc1.depositar(1000);
		System.out.println("Saldo " + cc1.getSaldo());		
		System.out.println("Limite " + cc1.getLimite());
		System.out.println("Saldo com limite " + cc1.getSaldoComLimite());
		cc1.sacar(100);
		System.out.println("Saldo  " + cc1.getSaldo());
		System.out.println("Saldo com limite " + cc1.getSaldoComLimite());
		
		
		
	}
	
}
