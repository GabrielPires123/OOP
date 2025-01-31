package Aplication;

import db.DB;
import db.DBexception;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        SimpleDateFormat fds = new SimpleDateFormat("dd/MM/yyyy");

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT " +
                    "INTO seller" +
                    "(Name, Email, BirthDate,BaseSalary,DepartmentId)" +
                    "VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);


            st.setString(1, "Gabriel Pires");
            st.setString(2, "Gabriel@gmail.com");
            st.setDate(3, new java.sql.Date(fds.parse("08/04/2025").getTime()));
            st.setDouble(4, 1805.89);
            st.setInt(5, 1);

            int teste = st.executeUpdate();

            if (teste >0)
            {
                ResultSet rs = st.getGeneratedKeys();
                while(rs.next())
                {
                    int id = rs.getInt(1);
                    System.out.println("id" + id);
                }
            }


        } catch (SQLException | ParseException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
           DB.closeConnection();
        }
    }
}
