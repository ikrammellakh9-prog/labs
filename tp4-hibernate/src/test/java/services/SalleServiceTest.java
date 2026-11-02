package services;

import entities.Salle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalleServiceTest {

    @Test
    public void testCreateAndGetSalle() {
        SalleService service = new SalleService();
        Salle salle = new Salle("Lab-Info");
        boolean created = service.create(salle);
        Assertions.assertTrue(created);
        Assertions.assertNotNull(salle.getId());

        Salle fetched = service.getById(salle.getId());
        Assertions.assertNotNull(fetched);
        Assertions.assertEquals("Lab-Info", fetched.getCode());
    }
}
