package Aplication;

import Modal.dao.DaoFactory;
import Modal.dao.SellerDAO;
import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        SellerDAO sellerDAO = DaoFactory.creaSellerDAO();

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll =====");
        list = sellerDAO.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
        /*Seller newSeller = new Seller(4000.0, new Date(), "Gabriel@gmailc.", null, "Gabriel",department);
        sellerDAO.insert(newSeller);
        System.out.println("Inserted! new id =" + newSeller.getId());*/

        System.out.println("\n=== TEST 4: UPGRADE =====");
        seller = sellerDAO.findById(1);
        seller.setName("Pato da silva");
        sellerDAO.upDate(seller);
        System.out.println("UPGRADE OK!");

        System.out.println("\n=== TEST 5: DELETE =====");
        int id = sc.nextInt();
        sellerDAO.deleteById(id);
        System.out.println("DELETE OK!");
        sc.close();


    }
}