package Aplication;

import db.DB;
import db.DBexception;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try
        {

            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from department,seller");

            while(rs.next())
            {
                System.out.println("Id:"+ rs.getInt("Id") + "," + " departamento:"+rs.getString("Name")+ " Pessoa: "+rs.getString("Name"));
            }

        } catch (SQLException e) {
            throw new DBexception(e.getMessage());
        }


    }
}