import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TesteCarro {
    private static Carro fusca;

    @BeforeAll
    public static void iniciaTudo(){
        fusca = new Carro("Preto","Beetle",110);
        if (fusca.ligaedesliga()) {
            fusca.acelera(60);
        }
        fusca.acelera(30);
    }

    @Test
    public void testeCor(){
        Assertions.assertEquals("Preto",fusca.getCor(),"A cor não é a esperada.");
    }

    @Test
    public void testeAcelera(){
        Assertions.assertEquals(90,fusca.getVelocidadeAtual(),"A velocidade não é a esperada.");
    }

    @Test
    public void testeLigado(){
        Assertions.assertEquals(true,fusca.getLigado(),"O carro nã está no estado esperado.");
    }

    @Test
    public void testeMarcha(){
        Assertions.assertEquals(3,fusca.pegaMarcha(),"O carro não está na marcha esperada.");
    }

    /*public static void main(String[] args){
        Carro fusca = new Carro("Preto","Beetle ",110);
        if (fusca.ligaedesliga()){fusca.acelera(60);}
    }*/
}