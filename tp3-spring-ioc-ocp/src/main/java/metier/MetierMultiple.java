package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("metierMultiple")
public class MetierMultiple {

    @Autowired
    private List<IDao> allDaos;

    @Autowired
    private Map<String, IDao> daoMap;

    public void afficherToutesLesDaos() {
        System.out.println("--- Liste de toutes les implémentations IDao injectées : ---");
        for (IDao dao : allDaos) {
            System.out.println("DAO : " + dao.getClass().getSimpleName() + " -> Valeur : " + dao.getValue());
        }
    }

    public IDao getDaoByName(String name) {
        return daoMap.get(name);
    }
}
