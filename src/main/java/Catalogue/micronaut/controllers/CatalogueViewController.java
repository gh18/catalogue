package Catalogue.micronaut.controllers;

import Catalogue.micronaut.models.CatalogueItem;
import io.micronaut.http.annotation.*;
import io.micronaut.http.MediaType;

import java.util.HashMap;

@Controller("/item")
public class CatalogueViewController {

    HashMap<Integer, CatalogueItem> catalogue = new HashMap<>();
    CatalogueItem item1 = new CatalogueItem("/some_path",
                "CAPiTA Kazu Kokubo",
                560.4,
                001,
                3);

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public String viewCatalogue() {
        return catalogue.toString();        // хотелось юы вернуть строковое (а лучше json) представление каталога
    }

    @Post
    public void addItem(CatalogueItem item) {
        if (item != null) {
            catalogue.put(item.getInventoryNumber(), item);
        }
                            // передаем товар/позицию и обновляем каталог
    }

//    @Put
//    public void updateInfo(file/resource at URI) {
//                            // например, изменить отдельную картинку на конкретной странице
//    }

    @Delete
    public void deleteItem(int inventoryNumber) {
        if (catalogue.containsKey(inventoryNumber)) {
            catalogue.remove(inventoryNumber);
        } else {
            System.out.println("Item: " + inventoryNumber + " not found");
        }

    }
}
