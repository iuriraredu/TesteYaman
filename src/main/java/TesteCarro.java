import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TesteCarro {
    private static Carro fusca;

    @BeforeAll
    public static void iniciaTudo(){
        fusca = new Carro("Preto","Beetle ",110);
        if (fusca.ligaedesliga()) {
            fusca.acelera(60);
        }
        fusca.acelera(30);
    }

    @Test
    public void testeCor(){
        Assertions.assertEquals("Preto",fusca.getCor(),"O carro não é Amarelo");
    }

    @Test
    public void testeAcelera(){
        Assertions.assertEquals(90,fusca.getVelocidadeAtual(),"O carro não é Amarelo");
    }

    @Test
    public void testeLigado(){
        Assertions.assertEquals(true,fusca.getLigado(),"O carro foi desligado");
    }

    @Test
    public void testeMarcha(){
        Assertions.assertEquals(3,fusca.pegaMarcha(),"O carro não está na marcha testada");
    }

    /*public static void main(String[] args){
        Carro fusca = new Carro("Preto","Beetle ",110);
        if (fusca.ligaedesliga()){fusca.acelera(60);}
    }*/
}