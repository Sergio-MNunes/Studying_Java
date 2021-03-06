
public class TestaPOO {
	public static void main(String[] args) {
		Cliente sergio = new Cliente();
		sergio.nome = "Sergio de Magalhaes Nunes";
		sergio.cpf = "99999999999";
		sergio.profissao = "Analista";
		
		Conta conta = new Conta(); // Cria��o de um objeto: Conta (tipo de vari�vel) conta (nome da vari�vel) = new Conta() (instancia��o do objeto)
		conta.titular = sergio;
		conta.deposita(100);
		
		Conta contaAleatoria = new Conta();
		contaAleatoria.deposita(500);
		
		boolean transferenciaDeuCerto = contaAleatoria.transfere(200, conta); 
		if (transferenciaDeuCerto) {
			System.out.println("Transferencia efetuada com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		
		System.out.println(conta.titular.nome);
		System.out.println(conta.saldo);
		System.out.println(contaAleatoria.saldo);
		
	}
}
