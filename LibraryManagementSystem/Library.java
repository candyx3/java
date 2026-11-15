
package LibraryManagementSystem;

import java.util.*;

class Book {
    int id;
    String name, author, category;
    boolean available = true;

    Book(int id, String name, String author, String category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }
}

public class Library {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add Book");
            System.out.println("2.Display Books");
            System.out.println("3.Search Book");
            System.out.println("4.Issue Book");
            System.out.println("5.Return Book");
            System.out.println("6.Delete Book");
            System.out.println("7.Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;
                    for (Book b : books)
                        if (b.id == id) exists = true;

                    if (exists) {
                        System.out.println("ID already exists!");
                        break;
                    }

                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    books.add(new Book(id, name, author, category));
                    System.out.println("Book Added!");
                    break;

                case 2:
                    for (Book b : books)
                        if (b.available)
                            System.out.println(b.id + " " + b.name + " " + b.author);
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();
                    exists = false;

                    for (Book b : books)
                        if (b.id == id) {
                            System.out.println(b.name + " - " +
                                (b.available ? "Available" : "Issued"));
                            exists = true;
                        }

                    if (!exists) System.out.println("Book Not Found!");
                    break;

                case 4:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Student Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Book ID: ");
                    id = sc.nextInt();

                    exists = false;
                    for (Book b : books)
                        if (b.id == id) {
                            exists = true;
                            if (b.available) {
                                b.available = false;
                                System.out.println("Book Issued to " + sname);
                            } else System.out.println("Already Issued!");
                        }

                    if (!exists) System.out.println("Book Not Found!");
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();
                    exists = false;

                    for (Book b : books)
                        if (b.id == id && !b.available) {
                            b.available = true;
                            exists = true;
                            System.out.println("Book Returned!");
                        }

                    if (!exists) System.out.println("Book Not Issued!");
                    break;

                case 6:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();
                    exists = false;

                    for (int i = 0; i < books.size(); i++) {
                        Book b = books.get(i);
                        if (b.id == id) {
                            exists = true;
                            if (b.available) {
                                books.remove(i);
                                System.out.println("Book Deleted!");
                            } else System.out.println("Book Is Issued!");
                            break;
                        }
                    }

                    if (!exists) System.out.println("Book Not Found!");
                    break;

                case 7:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
