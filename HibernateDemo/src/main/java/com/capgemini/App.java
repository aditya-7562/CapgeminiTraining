package com.capgemini;

import com.capgemini.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

//        createStudent(factory, "Ankit", 21);
//        createStudent(factory, "Ravi", 22);

//        readStudentById(factory, 1L);
//        readAllStudents(factory);

//        updateStudentById(factory, 1L, "Ankit Sharma", 23);
//        updateStudentNameOnly(factory, 2L, "Ravi Kumar");

//        deleteStudentById(factory, 1L);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT CRUD MENU =====");
            System.out.println("1. Create Student");
            System.out.println("2. Read Student by ID");
            System.out.println("3. Read All Students");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    createStudent(factory, name, age);
                }
                case 2 -> {
                    System.out.print("Enter ID: ");
                    long id = sc.nextLong();
                    readStudentById(factory, id);
                }
                case 3 -> readAllStudents(factory);

                case 4 -> {
                    System.out.print("Enter ID: ");
                    long id = sc.nextLong();

                    System.out.print("Enter new name: ");
                    sc.nextLine();
                    String newName = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();

                    updateStudentById(factory, id, newName, newAge);
                }
                case 5 -> {
                    System.out.print("Enter ID: ");
                    long id = sc.nextLong();
                    deleteStudentById(factory, id);
                }
                case 0 -> {
                    System.out.println("Exiting...");
                    factory.close();
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }

        }
    }


    // CREATE
    private static void createStudent(SessionFactory factory, String name, int age) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            Student st = new Student(name, age);
            session.persist(st);
            tx.commit();
            System.out.println("CREATE: " + st);
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    // READ BY ID
    private static void readStudentById(SessionFactory factory, Long id) {
        Session session = factory.openSession();

        try {
            Student st = session.get(Student.class, id);
            if (st != null) {
                System.out.println("READ BY ID: " + st);
            } else {
                System.out.println("Student not found with id = " + id);
            }
        } finally {
            session.close();
        }
    }

    // READ ALL
    private static void readAllStudents(SessionFactory factory) {
        Session session = factory.openSession();

        try {
            List<Student> students =
                    session.createQuery("from Student", Student.class).list();

            System.out.println("READ ALL:");
            students.forEach(System.out::println);
        } finally {
            session.close();
        }
    }

    // UPDATE FULL ENTITY
    private static void updateStudentById(SessionFactory factory, Long id, String newName, int newAge) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            Student st = session.get(Student.class, id);
            if (st == null) {
                System.out.println("UPDATE FAILED: Student not found with id = " + id);
                return;
            }

            st.setName(newName);
            st.setAge(newAge);

            session.merge(st);
            tx.commit();

            System.out.println("UPDATE: " + st);
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    // UPDATE ONLY NAME
    private static void updateStudentNameOnly(SessionFactory factory, Long id, String newName) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            Student st = session.get(Student.class, id);
            if (st == null) {
                System.out.println("UPDATE FAILED: Student not found with id = " + id);
                return;
            }

            st.setName(newName);
            tx.commit();

            System.out.println("UPDATE NAME ONLY: " + st);
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    // DELETE
    private static void deleteStudentById(SessionFactory factory, Long id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            Student st = session.get(Student.class, id);
            if (st == null) {
                System.out.println("DELETE FAILED: Student not found with id = " + id);
                return;
            }

            session.remove(st);
            tx.commit();

            System.out.println("DELETE: Student removed with id = " + id);
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
