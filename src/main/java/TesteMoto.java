import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TesteMoto {
    private static Moto bis;

    @BeforeAll
    public static void iniciaTudo(){
        bis = new Moto("Preto","Honda",2,3,2020,false,100);
    }

    @Test
    public void testeAcelera(){
        bis.acelerar(60);
        Assertions.assertEquals(60,bis.getVelocidadeAtual(),"A moto está parada.");
    }

    @Test
    public void testeParar(){
        bis.acelerar(10);
        bis.parar();
        Assertions.assertEquals(0,bis.getVelocidadeAtual(),"A moto está em movimento.");
    }

    @Test
    public void testeCor(){
        bis.setCor("Laranja");
        Assertions.assertEquals("Laranja",bis.getCor(),"A cor não é a esperada.");
    }

    @Test
    public void testeFabricante(){
        Assertions.assertEquals("Honda",bis.getFabricante(),"O Fabricante não é o esperado.");
    }
}
