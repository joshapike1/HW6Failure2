import org.apache.commons.io.*;
import org.apache.commons.lang3.*;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Dealer implements Serializable {
    private String DATA_URL = "https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt";
    private Inventory Inventory;

    /**
     * Default constructor sets the inventory
     */
    public Dealer() {
        Inventory = new Inventory();
    }

    public void loadDataFromWeb() {
        InputStream in = null;

        try {
            in = new URL(DATA_URL).openStream();
            LineIterator lineIterator = IOUtils.lineIterator(in, StandardCharsets.UTF_8);
            while (lineIterator.hasNext()) {
                String line = lineIterator.nextLine();
                String[] fields = line.split(",");
                if ((fields.length == 4)) {
                    Inventory.addVehicle(new Vehicle(fields[0], Integer.parseInt(fields[1]), Boolean.parseBoolean(fields[3]), Integer.parseInt(fields[2]), 0));
                } else {
                    Inventory.addVehicle(new Vehicle(fields[0], Integer.parseInt(fields[1]), false, Integer.parseInt(fields[2]), 0));
                }
            }
            lineIterator.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    /**
     * Serializes the dealer object
     */
    public void serializeDealer() {
        File file = FileUtils.getFile("./", "inventory.obj");
        byte[] data = SerializationUtils.serialize(Inventory);
        try {
            FileUtils.writeByteArrayToFile(file, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deserializes the dealer object
     */
    public void deserializeDealer() {
        File file = FileUtils.getFile("./", "inventory.obj");

        byte[] dataToDeserialize = null;
        try {
            dataToDeserialize = FileUtils.readFileToByteArray(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Inventory deserializeDealer = SerializationUtils.deserialize(dataToDeserialize);
        for (Vehicle v : deserializeDealer.getInventoryList()) {
            v.printVehicle();
            System.out.println();
        }
    }
}