import java.util.Date;

public class Caixa {

    private int dia;
    private String turno;
    private String status;

    public Caixa(int dia, String turno) {
        this.dia = dia;
        this.turno = turno;
    }

    public String getStatus() {
        return status;
    }

    public void abrirCaixa() {
        this.status = "Caixa Aberto!";
    }

    public void fecharCaixa() {
        this.status = "Caixa Fechado!";
    }
}