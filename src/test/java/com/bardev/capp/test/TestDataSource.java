package com.bardev.capp.test;

import com.bardev.capp.config.SpringRootConfig;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestDataSource {
    
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        JdbcTemplate jt = new JdbcTemplate(ds);
        String sql = "INSERT INTO user("
                + "`name`, `phone`, `email`,"
                + "`address`, `loginName`, `password`) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        Object[] param = new Object[]{"Krzysztof", "123456789", "mail@test.pl", "addres", "krzb", "krzb"};
        jt.update(sql, param);
        System.out.print("----SQL executed----");
    }
}
