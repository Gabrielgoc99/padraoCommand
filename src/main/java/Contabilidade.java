import java.util.ArrayList;
import java.util.List;

public class Contabilidade {

    private List<Venda> vendas = new ArrayList<Venda>();

    public void efetuarVenda(Venda venda) {
        this.vendas.add(venda);
        venda.efetuar();
    }

    public void cancelarVenda() {
        if (vendas.size() != 0) {
            Venda venda = this.vendas.get(this.vendas.size() - 1);
            venda.cancelar();
            this.vendas.remove(this.vendas.size() - 1);
        }
    }

}