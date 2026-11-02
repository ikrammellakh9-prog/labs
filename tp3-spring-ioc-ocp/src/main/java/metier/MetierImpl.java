package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("metier")
public class MetierImpl implements IMetier {

    private IDao dao;

    // Injection par constructeur
    @Autowired
    public MetierImpl(@Qualifier("selectedDao") IDao dao) {
        this.dao = dao;
    }

    @PostConstruct
    public void init() {
        System.out.println("[MetierImpl] Initialisé avec succès. DAO injecté : " + (dao != null ? dao.getClass().getSimpleName() : "null"));
    }

    @Override
    public double calcul() {
        double val = dao.getValue();
        // Logique métier : calcul d'un facteur pondéré
        return val * 2.5;
    }

    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
