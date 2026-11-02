import config.AppConfig;
import metier.IMetier;
import metier.MetierMultiple;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat du calcul métier : " + metier.calcul());

        MetierMultiple metierMultiple = context.getBean(MetierMultiple.class);
        metierMultiple.afficherToutesLesDaos();

        context.close();
    }
}
