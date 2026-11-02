package dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        // Simulation de récupération pour tests / version 2
        return 150.0;
    }
}
