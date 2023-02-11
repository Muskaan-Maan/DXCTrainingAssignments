package JDBC;

import java.util.*;

public class BMSTester {

    public static void main(String[] args)throws Exception{

        Scanner scn = new Scanner(System.in);

        AddBook ab;
        DeleteBook db;
        UpdateBook up;
        SearchBook sb;
        ShowBook shb;

        System.out.println("*************************Welcome to the Library*************************");

        System.out.print("Enter your choice : ");
        int choice = scn.nextInt();

        switch (choice){
            case 1 :
                ab = new AddBook();
                break;

            case 2 :
                db = new DeleteBook();;
                break;

            case 3 :
                up = new UpdateBook();
                break;

            case 4 :
                sb = new SearchBook();
                break;

            case 5 :
                shb = new ShowBook();
                break;

            case 6 :
                System.out.println("Exit");
                break;

            default :
                System.out.println("Invalid Choice");
                break;
        }

    }
}
