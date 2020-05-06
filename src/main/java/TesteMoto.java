import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TesteMoto {
    private static Moto bis;

    @BeforeAll
    public static void iniciaTudo(){
        bis = new Moto("Preta","Honda",2,4,2020,false,100);
    }


}
