import org.junit.Assert;
import org.junit.Test;

import java.io.File;


public class DealerTest {

    Dealer dealer = new Dealer();

    @Test
    public void loadTest(){
        dealer.loadDataFromWeb();
    }

    @Test
    public void serializedTest(){
        dealer.serializeDealer();
    }


    @Test
        public void deserializeTest(){
        dealer.deserializeDealer();
    }
}