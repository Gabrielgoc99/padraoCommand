
public class AberturaCaixa implements Venda {

    private Caixa caixa;

    public AberturaCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public void efetuar() {
        this.caixa.abrirCaixa();
    }

    public void cancelar() {
        this.caixa.fecharCaixa();
    }
}