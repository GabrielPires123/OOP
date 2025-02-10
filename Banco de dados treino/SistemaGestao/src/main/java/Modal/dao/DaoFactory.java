package Modal.dao;

import Modal.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDAO creaSellerDAO()
    {
        return new SellerDaoJDBC();
    }
}
