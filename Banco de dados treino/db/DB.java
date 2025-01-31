package db;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection()
    {
        if(conn == null)
        {
            try
            {
                Properties properties = loadsql();
                String url = properties.getProperty("dburl");
                conn = DriverManager.getConnection(url,properties);
            } catch (SQLException e) {
                throw new DBexception(e.getMessage());
            }

        }
        return conn;
    }
    public static void closeConnection()
    {
        if (conn != null)
        {
            try{
                conn.close();
            } catch (SQLException e) {
                throw new DBexception(e.getMessage());
            }
        }

    }

    private static Properties loadsql() {
        try {
            Properties properties = new Properties();

            // Carrega o arquivo db.properties do classpath
            var inputStream = DB.class.getClassLoader().getResourceAsStream("db.properties");

            if (inputStream == null) {
                throw new DBexception("Arquivo db.properties não encontrado no classpath!");
            }

            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            throw new DBexception("Erro ao carregar o arquivo db.properties: " + e.getMessage());
        }
    }



}
