package dao;

import org.springframework.stereotype.Component;

@Component("daoFile")
public class DaoFile implements IDao {
    @Override
    public double getValue() {
        // Simulation de lecture depuis un fichier plat / CSV
        return 80.0;
    }
}
