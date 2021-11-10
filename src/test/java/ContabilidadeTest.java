
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContabilidadeTest {

    Contabilidade contabilidade;
    Caixa caixa;

    @BeforeEach
    void setUp() {
        contabilidade = new Contabilidade();
        caixa = new Caixa (10, "Manhã");
    }

    @Test
    void deveAbrirCaixa() {
        Venda aberturaCaixa = new AberturaCaixa(caixa);
        contabilidade.efetuarVenda(aberturaCaixa);

        assertEquals("Caixa Aberto!", caixa.getStatus());
    }

    @Test
    void deveFecharCaixa() {
        Venda fechamentoCaixa = new FechamentoCaixa(caixa);
        contabilidade.efetuarVenda(fechamentoCaixa);

        assertEquals("Caixa Fechado!", caixa.getStatus());
    }

    @Test
    void deveCancelarFechamentoCaixa() {
        Venda aberturaCaixa = new AberturaCaixa(caixa);
        Venda fechamentoCaixa = new FechamentoCaixa(caixa);

        contabilidade.efetuarVenda(aberturaCaixa);
        contabilidade.efetuarVenda(fechamentoCaixa);

        contabilidade.cancelarVenda();

        assertEquals("Caixa Aberto!", caixa.getStatus());
    }

}