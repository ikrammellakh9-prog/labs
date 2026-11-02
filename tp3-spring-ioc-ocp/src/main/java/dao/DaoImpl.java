package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        // Simulation de récupération depuis une base de données
        return 100.0;
    }
}
