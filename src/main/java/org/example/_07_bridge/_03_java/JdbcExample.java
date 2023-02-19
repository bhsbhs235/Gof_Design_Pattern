package org.example._07_bridge._03_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName ("org.h2.Driver"); // mysql로 바꿔도 Driver 인터페이스는 바뀌지 않는(OCP)

        try (Connection conn = DriverManager.getConnection ("jdbc:h2:mem:~/test", "sa","")) {

            String sql =  "CREATE TABLE  ACCOUNT " +
                    "(id INTEGER not NULL, " +
                    " email VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";

            Statement statement = conn.createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
