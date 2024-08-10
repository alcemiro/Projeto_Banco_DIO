import lombok.Getter;

@Getter

public class AplicacaoCDI extends Conta{
    public AplicacaoCDI(Cliente cliente) {
        super(cliente);
    }

    private double saldoAplicacao;
    private static final double potencia = 6;
    private static double expoente = 1.05;



    public void calculaCDI(double saldo){
        this.saldo = saldo;
        this.saldoAplicacao = (this.saldo * Math.pow(expoente, potencia)) - this.saldo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato da aplicacao=====");
        super.imprimirInfoComuns();
        System.out.println(String.format("Rendimento após 6 meses será: %.2f", this.saldoAplicacao));
    }
}
