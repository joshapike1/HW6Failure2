import org.apache.commons.io.*;
import org.apache.commons.lang3.*;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Dealer implements Serializable {
    private String DATA_URL = "https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt";
    private Inventory webInventory;

    public Dealer() {
        webInventory = new Inventory();
    }

    //Reads data from web and inserts it into a Vehicle Object
    public void loadDataFromWeb() {
        InputStream in = null;

        try {
            in = new URL(DATA_URL).openStream();
            LineIterator lineIterator = IOUtils.lineIterator(in, StandardCharsets.UTF_8);
            while (lineIterator.hasNext()) {
                String line = lineIterator.nextLine();
                String[] info = line.split(",");
                if ((info.length == 4)) {
                    webInventory.addVehicle(new Vehicle(info[0], Integer.parseInt(info[1]), Boolean.parseBoolean(info[3]), Integer.parseInt(info[2]), 0));
                } else {
                    webInventory.addVehicle(new Vehicle(info[0], Integer.parseInt(info[1]), false, Integer.parseInt(info[2]), 0));
                }
            }
            lineIterator.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    //Serializes the dealer object
    public void serializeDealer() {
        File carList = FileUtils.getFile("./", "inventory.obj");
        byte[] dataFromWeb = SerializationUtils.serialize(webInventory);
        try {
            FileUtils.writeByteArrayToFile(carList, dataFromWeb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Deserializes the dealer object
    public void deserializeDealer() {
        File carList = FileUtils.getFile("./", "inventory.obj");

        byte[] webDataFile = null;
        try {
            webDataFile = FileUtils.readFileToByteArray(carList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Inventory deserializeDealer = SerializationUtils.deserialize(webDataFile);
        for (Vehicle vehicle : deserializeDealer.getInventoryList()) {
            vehicle.printVehicle();
            System.out.println();
        }
    }
}