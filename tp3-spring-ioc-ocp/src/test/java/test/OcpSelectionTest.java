package test;

import config.AppConfig;
import metier.IMetier;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OcpSelectionTest {

    @Test
    public void testOcpSelection() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IMetier metier = context.getBean(IMetier.class);
        Assert.assertNotNull("Le bean IMetier ne doit pas être null", metier);
        double resultat = metier.calcul();
        Assert.assertEquals(250.0, resultat, 0.001);
        context.close();
    }
}
