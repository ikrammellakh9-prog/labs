package dao;

import org.springframework.stereotype.Component;

@Component("daoApi")
public class DaoApi implements IDao {
    @Override
    public double getValue() {
        // Simulation d'appel à une API REST externe
        return 220.0;
    }
}
