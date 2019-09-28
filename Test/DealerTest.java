import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;


public class DealerTest {

    Dealer dealer = new Dealer();

    // Test dealer.loadWebData
    @Test
    public void loadTest(){
        dealer.loadDataFromWeb();
        Assert.assertTrue(dealer != null);

    }

    // Test dealer.serializeDealer
    @Test
    public void serializedTest(){
        File file = new File("C:\\Users\\josha\\IdeaProjects\\hw5-joshapike1\\inventory.obj");
        Assert.assertTrue(file.exists());
    }

    // Test dealer.deserializeDealer
    @Test
        public void deserializeTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        dealer.loadDataFromWeb();
        dealer.serializeDealer();
        dealer.deserializeDealer();
        String expectedOutput  = "2015 Ford F150\r" +
                "4WD\r" +
                "$35,000\r" +
                "0 MPG\r" +
                "\r" +
                "2010 Ford Focus\r" +
                "2WD\r" +
                "$15,000\r" +
                "0 MPG\r" +
                "\r" +
                "2012 Ford Fiesta\r" +
                "2WD\r" +
                "$18,000\r" +
                "0 MPG\r" +
                "\r" +
                "2015 Ford Fusion\r" +
                "2WD\r" +
                "$20,000\r" +
                "0 MPG\r" +
                "\r" +
                "1999 Ford Mustang\r" +
                "2WD\r" +
                "$8,000\r" +
                "0 MPG\r" +
                "\r" +
                "2017 Ford GT\r" +
                "2WD\r" +
                "$30,000\r" +
                "0 MPG\r" +
                "\r" +
                "2015 Ford Taurus\r" +
                "2WD\r" +
                "$25,000\r" +
                "0 MPG\r" +
                "\r" +
                "2016 GM Sierra\r" +
                "4WD\r" +
                "$40,000\r" +
                "0 MPG\r" +
                "\r" +
                "2016 Chevy Silverado\r" +
                "4WD\r" +
                "$35,000\r" +
                "0 MPG\r\r";
        Assert.assertEquals(expectedOutput.replaceAll("\n", "").replaceAll("\r", ""), outContent.toString().replaceAll("\n", "").replaceAll("\r", ""));
    }
}