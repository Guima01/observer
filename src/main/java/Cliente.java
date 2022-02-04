import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimoAviso;

    public Cliente(String nome){
        this.nome = nome;
    }

    public String getUltimoAviso(){
        return this.ultimoAviso;
    }

    public void comprar(Concessionaria concessionaria){
        concessionaria.addObserver(this);

    }

    @Override
    public void update(Observable concessionaria, Object arg1){
        this.ultimoAviso = this.nome + ", parcela do carro lançada " + concessionaria.toString();
    }



}