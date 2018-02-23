package com.dango.Comparison.configuration;


import lombok.Setter;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Setter
public class DataSourceConfiguration {
    private String jdbcUrl;
    private String username;
    private String password;
    private String driverClassName;

//    @Bean
//    public ComboPooledDataSource dataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource=new ComboPooledDataSource();
//        dataSource.setDriverClass(driverClassName); //loads the jdbc driver
//        dataSource.setJdbcUrl(jdbcUrl);
//        dataSource.setUser(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }

//    @Bean
//    public DataSource dataSource()  {
//
//        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//        return builder
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("sql/create.sql")
////                .addScript("sql/insert.sql")
//                .build();
//    }


//    @Bean
//    DataSource dataSource() throws SQLException {
//
//        OracleDataSource dataSource = new OracleDataSource();
//        dataSource.setUser(username);
//        dataSource.setPassword(password);
//        dataSource.setURL(url);
//        dataSource.setImplicitCachingEnabled(true);
//        dataSource.setFastConnectionFailoverEnabled(true);
//        return dataSource;
//    }

    @Bean
    DataSource dataSource() throws SQLException {

        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(jdbcUrl);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }
}
