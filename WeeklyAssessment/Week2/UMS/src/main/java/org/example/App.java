package org.example;

import entity.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class App {

    static SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== UMS MENU ======");
            System.out.println("1. Create Department");
            System.out.println("2. Create Student");
            System.out.println("3. Assign Student to Department");
            System.out.println("4. Create ID Card for Student");
            System.out.println("5. Create Course");
            System.out.println("6. Enroll Student in Course");
            System.out.println("7. View All Students");
            System.out.println("8. View All Courses");
            System.out.println("9. View All Departments");
            System.out.println("10. Delete Student");
            System.out.println("11. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> createDepartment(sc);
                case 2 -> createStudent(sc);
                case 3 -> assignStudentToDepartment(sc);
                case 4 -> createIDCard(sc);
                case 5 -> createCourse(sc);
                case 6 -> enrollStudent(sc);
                case 7 -> viewAllStudents();
                case 8 -> viewAllCourses();
                case 9 -> viewAllDepartments();
                case 10 -> deleteStudent(sc);
                case 11 -> {
                    factory.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void createDepartment(Scanner sc) {
        System.out.print("Department name: ");
        String name = sc.nextLine();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(new Department(name));

        tx.commit();
        session.close();
    }

    static void createStudent(Scanner sc) {
        System.out.print("Student name: ");
        String name = sc.nextLine();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(new Student(name));

        tx.commit();
        session.close();
    }

    static void assignStudentToDepartment(Scanner sc) {
        System.out.print("Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print("Department ID: ");
        int did = sc.nextInt();
        sc.nextLine();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, sid);
        Department d = session.get(Department.class, did);

        if (s != null && d != null) {
            d.addStudent(s);
            session.merge(d);
        } else {
            System.out.println("Invalid IDs");
        }

        tx.commit();
        session.close();
    }

    static void createIDCard(Scanner sc) {
        System.out.print("Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print("Card Number: ");
        String card = sc.nextLine();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, sid);
        if (s != null) {
            s.setIdCard(new IDCard(card));
            session.merge(s);
        } else {
            System.out.println("Student not found");
        }

        tx.commit();
        session.close();
    }

    static void createCourse(Scanner sc) {
        System.out.print("Course name: ");
        String name = sc.nextLine();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(new Course(name));

        tx.commit();
        session.close();
    }

    static void enrollStudent(Scanner sc) {
        System.out.print("Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print("Course ID: ");
        int cid = sc.nextInt();
        sc.nextLine();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, sid);
        Course c = session.get(Course.class, cid);

        if (s != null && c != null) {
            s.addCourse(c);
            session.merge(s);
        } else {
            System.out.println("Invalid IDs");
        }

        tx.commit();
        session.close();
    }

    static void viewAllStudents() {

        Session session = factory.openSession();

        List<Student> list = session.createQuery("from Student", Student.class).list();
        for (Student s : list) {
            System.out.println("ID: " + s.getId() + " | Name: " + s.getName() + " | IDCard: " + s.getIdCard().getCardNumber() + " | Department: " + s.getDepartment().getName() + " | Courses: " + s.getCourses().stream().map(Course::getCourseName).reduce((a, b) -> a + ", " + b).orElse("None"));
        }

        session.close();
    }

    static void viewAllCourses() {
        Session session = factory.openSession();

        List<Course> list = session.createQuery("select distinct c from Course c left join fetch c.students",Course.class).list();

        for (Course c : list) {

            String students = c.getStudents().stream().map(Student::getName).reduce((a, b) -> a + ", " + b).orElse("No students enrolled");

            System.out.println("Course ID: " + c.getId() + " | Name: " + c.getCourseName() + " | Students: " + students);
        }

        session.close();
    }

    static void viewAllDepartments() {
        Session session = factory.openSession();

        List<Department> list = session.createQuery("select distinct d from Department d left join fetch d.students",Department.class).list();

        for (Department d : list) {

            String students = d.getStudents().stream().map(Student::getName).reduce((a, b) -> a + ", " + b).orElse("No students");

            System.out.println("Department ID: " + d.getId() + " | Name: " + d.getName() + " | Students: " + students);
        }

        session.close();
    }

    static void deleteStudent(Scanner sc) {
        System.out.print("Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, sid);
        if (s != null) {
            session.remove(s);
        } else {
            System.out.println("Student not found");
        }

        tx.commit();
        session.close();
    }
}