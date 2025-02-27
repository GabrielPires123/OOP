package Modal.dao;

import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.List;

public interface SellerDAO {

    void insert(Seller obj);
    void upDate(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);

}
