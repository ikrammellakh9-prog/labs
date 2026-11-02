package config;

import dao.IDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class DynamicDaoConfig {

    @Value("${dao.target:dao}")
    private String daoTarget;

    @Bean(name = "selectedDao")
    public IDao selectedDao(Map<String, IDao> daos) {
        IDao dao = daos.get(daoTarget);
        if (dao == null) {
            dao = daos.get("dao");
        }
        return dao;
    }
}
