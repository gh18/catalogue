package Catalogue.micronaut.models;

import java.util.HashMap;

public class CatalogueItem {

    private String imagePath;
    private String name;
    private double price;
    private int inventoryNumber;
    private int quantityInStock;

    public CatalogueItem() {}

    public CatalogueItem(String imagePath, String name, double price, int inventoryNumber, int quantityInStock) {
        this.imagePath = imagePath;
        this.name = name;
        this.price = price;
        this.inventoryNumber = inventoryNumber;
        this.quantityInStock = quantityInStock;
    }

    public String getItemInfo() {
        return "Inventory number: " + inventoryNumber + "\n" +
                "Items in stock: " + quantityInStock + "\n" +
                "Price: " + price + "\n";
    }

    private void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public String getImagePath() {return imagePath;}

    private void setName(String name) {this.name = name;}
    public String getName() {return name;}

    private void setPrice(double price) {this.price = price;}
    public double getPrice() {return price;}

    private void setInventoryNumber(int inventoryNumber) {this.inventoryNumber = inventoryNumber;}
    public int getInventoryNumber() {return inventoryNumber;}

    private void setQuantityInStock(int quantityInStock) {this.quantityInStock = quantityInStock;}
    public int getQuantityInStock() {return quantityInStock;}

}
