package Aplication;

import Modal.dao.DaoFactory;
import Modal.dao.SellerDAO;
import Model.Entities.Seller;

public class Main
{
    public static void main(String[] args)
    {

        SellerDAO sellerDAO = DaoFactory.creaSellerDAO();

        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
    }
}