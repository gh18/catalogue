package Catalogue.micronaut.models;

import javax.inject.Singleton;
import java.util.HashMap;

@Singleton
public class Catalogue extends HashMap<Integer, CatalogueItem> {

    public Catalogue() {}

    protected Catalogue catalogue;

    public void printOut() {
        this.catalogue.forEach((key, value) -> {
            System.out.print("position: " + key);
            System.out.println("Item: " + value);
        });
    }

    public Catalogue createCatalogue() {
        return this.catalogue;
    }

    public void addItem(CatalogueItem item) {
        if (item != null) {
            this.catalogue.put(item.getInventoryNumber(), item);
        }
    }

    // TODO: override toString() method for CatalogueItem
    public String findByID(int inventoryNumber) {
        if (this.catalogue.containsKey(inventoryNumber)) {
            return this.catalogue.get(inventoryNumber).toString();
        } else return "Not Available";
    }

    protected void removeItem(int inventoryNumber) {
        // TODO: add checks before removing
        this.catalogue.remove(inventoryNumber);
    }
}
