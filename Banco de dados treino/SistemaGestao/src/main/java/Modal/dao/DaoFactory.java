package Modal.dao;

import Modal.dao.impl.SellerDaoJDBC;
import db.DB;

public class DaoFactory {

    public static SellerDAO creaSellerDAO()
    {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
