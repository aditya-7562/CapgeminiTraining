package com.capgemini;

import com.capgemini.entity.Menu;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        while (true) {
            System.out.println("\n---- Restaurant Menu Management ----");
            System.out.println("1. Add Menu Item");
            System.out.println("2. View All Items");
            System.out.println("3. Update Price");
            System.out.println("4. Delete Item");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addMenuItem(sessionFactory);
                case 2 -> viewAllItems(sessionFactory);
                case 3 -> updatePrice(sessionFactory);
                case 4 -> deleteItem(sessionFactory);
                case 5 -> {
                    sessionFactory.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private static void addMenuItem(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter category: ");
        String category = sc.next();

        System.out.print("Available (true/false): ");
        boolean available = sc.nextBoolean();

        Menu item = new Menu();
        item.setName(name);
        item.setPrice(price);
        item.setCategory(category);
        item.setAvailable(available);

        session.persist(item);
        tx.commit();
        session.close();

        System.out.println("Menu item added successfully.");
    }

    private static void viewAllItems(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        Query<Menu> query = session.createQuery("FROM Menu", Menu.class);
        List<Menu> items = query.list();

        if (items.isEmpty()) {
            System.out.println("No menu items found.");
        } else {

            for (Menu m : items) {
                System.out.println( m.getId() + " | " + m.getName() + " | " + m.getPrice() + " | " + m.getCategory() + " | " + m.isAvailable());
            }

        }
        session.close();
    }

    private static void updatePrice(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter item ID: ");
        int id = sc.nextInt();

        Menu item = session.get(Menu.class, id);

        if (item == null) {
            System.out.println("Item not found.");
        } else {
            System.out.print("Enter new price: ");
            double newPrice = sc.nextDouble();
            item.setPrice(newPrice);
            tx.commit();
            System.out.println("Price updated successfully.");
        }

        session.close();
    }

    private static void deleteItem(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter item ID: ");
        int id = sc.nextInt();

        Menu item = session.get(Menu.class, id);

        if (item == null) {
            System.out.println("Item not found.");
        } else {
            session.remove(item);
            tx.commit();
            System.out.println("Item deleted successfully.");
        }

        session.close();
    }
}
