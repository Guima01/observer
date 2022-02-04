import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {


    @Test
    void deveNotificarUmCliente() {
        Concessionaria  concessionaria = new Concessionaria(2021, "preto", "Uno", "Fiat");
        Cliente cliente = new Cliente("Guilherme");
        cliente.comprar(concessionaria);
        concessionaria.lancarParcelas();
        assertEquals("Guilherme, Novo carro disponivel {ano=2021, cor=preto, nomeCarro='Uno', nomeFilial='Fiat'}", cliente.getUltimoAviso());
    }

    @Test
    void deveNotificarUmClientes() {
        Concessionaria   concessionaria = new Concessionaria(2021, "preto", "Uno", "Fiat");
        Cliente cliente1 = new Cliente("Guilherme");
        Cliente cliente2 = new Cliente("João");
        cliente1.comprar(concessionaria);
        cliente2.comprar(concessionaria);
        concessionaria.lancarParcelas();
        assertEquals("Guilherme, Novo carro disponivel {ano=2021, cor=preto, nomeCarro='Uno', nomeFilial='Fiat'}", cliente1.getUltimoAviso());
        assertEquals("João, Novo carro disponivel {ano=2021, cor=preto, nomeCarro='Uno', nomeFilial='Fiat'}", cliente2.getUltimoAviso());
    }

    @Test
    void naoDeveNotificarUmAluno() {
        Concessionaria concessionaria = new Concessionaria(2021, "preto", "Uno", "Fiat");
        Cliente cliente = new Cliente("Guilherme");
        concessionaria.lancarParcelas();
        assertEquals(null, cliente.getUltimoAviso());
    }

    @Test
    void deveNotificarClientesMatriz() {
        Concessionaria   concessionaria1 = new Concessionaria(2021, "preto", "Uno", "Fiat");
        Concessionaria   concessionaria2 = new Concessionaria(2021, "preto", "Mobi", "Fiat");
        Cliente cliente1 = new Cliente("Guilherme");
        Cliente cliente2 = new Cliente("João");
        cliente1.comprar(concessionaria1);
        cliente2.comprar(concessionaria2);
        concessionaria1.lancarParcelas();
        assertEquals("Guilherme, Novo carro disponivel {ano=2021, cor=preto, nomeCarro='Uno', nomeFilial='Fiat'}", cliente1.getUltimoAviso());
        assertEquals(null, cliente2.getUltimoAviso());
    }

}