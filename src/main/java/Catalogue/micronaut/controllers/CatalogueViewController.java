package Catalogue.micronaut.controllers;

import Catalogue.micronaut.models.CatalogueItem;
import io.micronaut.http.annotation.*;
import io.micronaut.http.MediaType;

import java.util.HashMap;

@Controller
public class CatalogueViewController {

    HashMap<Integer, CatalogueItem> catalogue = new HashMap<>();

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public String viewCatalogue() {
        return "";          // хотелось юы вернуть строковое (а лучше json) представление каталога
    }

    @Post
    public void updateCatalogue(CatalogueItem item) {
                            // передаем товар/позицию и обновляем каталог
    }

//    @Put
//    public void updateImage(file/resource at URI) {
//                            // например, изменить отдельную картинку на конкретной странице
//    }

    @Delete
    public void deleteItem(CatalogueItem item) {

    }
}
