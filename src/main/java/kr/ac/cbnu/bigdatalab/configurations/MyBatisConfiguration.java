package kr.ac.cbnu.bigdatalab.configurations;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by PENHCHET on 10/21/2016.
 */
@Configuration
@MapperScan("kr.co.cbnu.bigdatalab.repositories")
public class MyBatisConfiguration {

    @Autowired
    private DataSource dataSource;

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        //TODO: TO SOVLE WITH DON'T KNOW THE PROPERTY MAPPING WITH NULL VALUE
        SqlSessionFactory sqlSessionFactory = sessionFactory.getObject();
        //sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
        sqlSessionFactory.getConfiguration().setJdbcTypeForNull(JdbcType.NULL);
        return sessionFactory;
    }
}
