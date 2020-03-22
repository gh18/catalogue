package Catalogue.micronaut;

import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class CatalogueViewControllerTests {

    @Inject
    EmbeddedServer server;

    @Test
    public void testAddItem() {}

    @Test
    public void testDeleteItem() {}

    @Test
    public void testViewCatalogue() {}

    @Test
    public void testUpdateInfo() {}

}
