import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Dealer dealer = new Dealer();
        dealer.loadDataFromWeb();
        dealer.serializeDealer();
        dealer.deserializeDealer();
    }
}