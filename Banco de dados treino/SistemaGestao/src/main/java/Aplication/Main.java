package Aplication;

import Modal.dao.DaoFactory;
import Modal.dao.SellerDAO;
import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {

        SellerDAO sellerDAO = DaoFactory.creaSellerDAO();

        Seller seller = sellerDAO.findById(3);

        System.out.println(sellerDAO.findAll());

        Department dept = new Department(4, "Books");
        Seller newSeller = new Seller(4000.0, new Date(), "Gabriel@gmailc.", null, "Gabriel",dept);


        sellerDAO.insert(newSeller);
        System.out.println("Inserted! new id =" + newSeller.getId());

    }
}