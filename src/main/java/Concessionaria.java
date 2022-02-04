import java.util.Observable;

public class Concessionaria extends Observable {

    private Integer ano;
    private String cor;
    private String nomeCarro;
    private String nomeFilial;

    public Concessionaria(Integer ano, String cor, String nomeCarro, String nomeFilial) {
        this.ano = ano;
        this.cor = cor;
        this.nomeCarro = nomeCarro;
        this.nomeFilial = nomeFilial;
    }


    public void lancarParcelas() {
        setChanged();
        notifyObservers();
    }

    @Override
    public java.lang.String toString() {
        return "{" +
                "ano=" + ano +
                ", cor=" + cor +
                ", nomeCarro='" + nomeCarro + '\'' +
                ", nomeFilial='" + nomeFilial + '\'' +
                '}';
    }
}