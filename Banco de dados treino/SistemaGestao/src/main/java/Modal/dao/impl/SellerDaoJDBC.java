package Modal.dao.impl;

import Modal.dao.SellerDAO;
import Model.Entities.Department;
import Model.Entities.Seller;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;
import db.DB;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDaoJDBC implements SellerDAO {

    private Connection conn;

    public SellerDaoJDBC(Connection conn)
    {
        this.conn = conn;
    }


    @Override
    public void insert(Seller obj)
    {

    }

    @Override
    public void upDate(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
       PreparedStatement st = null;
        ResultSet rs= null;
        try {

            st = conn.prepareStatement("SELECT seller.*,department.Name as DepName\n" +
                    "FROM seller INNER JOIN department\n" +
                    "ON seller.DepartmentId = department.Id\n" +
                    "WHERE seller.Id = ?");

            st.setInt(1,id);
            rs = st.executeQuery();

            if(rs.next())
            {
                Department department = new Department();
                department.setId(rs.getInt("DepartmentId"));
                department.setName("DepName");
                Seller obj = new Seller();
                obj.setId(rs.getInt("Id"));
                obj.setName(rs.getString("Name"));
                obj.setEmail(rs.getString("Email"));
                obj.setBaseSalary(rs.getDouble("BaseSalary"));
                obj.setBirthDate(rs.getDate("BirthDate"));
                obj.setDepartment(department);
                return obj;
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
