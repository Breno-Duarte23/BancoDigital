
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente breno = new Cliente();
		breno.setNome("Breno ");
		
		Cliente eliane = new Cliente();
		eliane.setNome("Eliane ");
		
		Cliente andre = new Cliente();
		andre.setNome("Andre");
		
		Conta cc = new ContaCorrente(breno);
		Conta poupanca = new ContaPoupanca(breno);
		
		Conta ccEliane = new ContaCorrente(eliane);
		Conta poupancaEliane = new ContaPoupanca(eliane);
		
		Conta ccAndre = new ContaCorrente(andre);
		Conta poupancaAndre = new ContaPoupanca(andre);
		
		cc.depositar(50);
		poupanca.depositar(60);
		
		ccEliane.depositar(70);
		poupancaEliane.depositar(80);
		
		ccAndre.depositar(90);
		poupancaAndre.depositar(100);
		
		Banco banco = new Banco();
		banco.getContas().add(cc);
		banco.getContas().add(poupanca);
		banco.getContas().add(ccEliane);
		banco.getContas().add(poupancaEliane);
		banco.getContas().add(ccAndre);
		banco.getContas().add(poupancaAndre);
		
		banco.exibirContas();
	}
}
