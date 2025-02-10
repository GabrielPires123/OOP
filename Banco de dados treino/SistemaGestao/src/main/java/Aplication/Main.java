package Aplication;

import Modal.dao.DaoFactory;
import Modal.dao.SellerDAO;

public class Main
{
    public static void main(String[] args)
    {

        SellerDAO sellerDAO = DaoFactory.creaSellerDAO();
    }
}