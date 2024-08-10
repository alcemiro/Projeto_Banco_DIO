import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Cliente amauri = new Cliente();
        amauri.setNome("Amauri");

        Conta cc = new ContaCorrente(amauri);
        Conta poupanca = new ContaPoupanca(amauri);
        Conta aplicacao = new AplicacaoCDI(amauri);

        cc.depositar(500);
        cc.transferir(100, poupanca);
        aplicacao.calculaCDI(1000);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        aplicacao.imprimirExtrato();

    }
}
