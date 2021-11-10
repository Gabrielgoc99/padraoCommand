
public class FechamentoCaixa implements Venda {

    private Caixa caixa;

    public FechamentoCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public void efetuar() {
        this.caixa.fecharCaixa();
    }

    public void cancelar() {
        this.caixa.abrirCaixa();
    }
}