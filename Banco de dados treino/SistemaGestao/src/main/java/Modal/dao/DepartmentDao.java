package Modal.dao;

import Model.Entities.Department;

import java.util.List;

public interface DepartmentDao {
    
    void insert(Department obj);
    void upDate(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
