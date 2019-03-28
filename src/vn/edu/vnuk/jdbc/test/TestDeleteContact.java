package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestDeleteContact {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner (System.in);
		System.out.println("Input id :");
		Long id = sc.nextLong();
		ContactDao contactDao = new ContactDao();
		
		contactDao.delete(id);
		
	}
}
