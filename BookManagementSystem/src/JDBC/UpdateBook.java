package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateBook {

    public UpdateBook() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        // variables
        final String url = "jdbc:mysql:///dxc";
        final String user = "root";
        final String password = "Marc93Mrmm@123";

        // prepare SQL query
        String updateQuery = "Update library set Title = ?, Author = ?, Edition = ? where BookID = ?";

        Scanner scn = null;
        int n = 0;
        int bookId = 0;
        String title = null;
        String author = null;
        String edition = null;


        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;

        try {
            // create Scanner class object
            scn = new Scanner(System.in);

            // take number of students
            if(scn != null) {
                System.out.print("Enter number of BookId's to be updated : ");
                n = scn.nextInt();
            }

            // establish the connection
            con = DriverManager.getConnection(url, user, password);
            // create JDBC statement object


            // compile SQL query and store it in
            // PreparedStatement object
            if(con != null) {
                ps = con.prepareStatement(updateQuery);
            }

            if(scn != null && ps != null) {
                for(int i=0; i<n; i++) {

                    // read input values
                    System.out.println("\nEnter BookId No"+(i+1)+" : ");



                    System.out.print("BookID : ");
                    bookId = scn.nextInt();

                    scn.nextLine();
                    System.out.print("Title : ");
                    title = scn.nextLine();
                    System.out.print("Author : ");
                    author = scn.nextLine();
                    System.out.print("Edition : ");
                    edition = scn.nextLine();

                    // set parameters values
                    ps.setString(1, title);
                    ps.setString(2, author);
                    ps.setString(3, edition);
                    ps.setInt(4, bookId);


                    // execute the query
                    result = ps.executeUpdate();
                }
            }

            // process the result
            if(result == 0) {
                System.out.println("\nRecords can not be updated. BookID doesn't exist! ");
            } else {
                System.out.println("\nRecords updated successfully.");
            }

        } catch(SQLException se) {
            se.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } // try-catch block

        finally {
            // close JDBC objects
            try {
                if(ps != null) ps.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
            try {
                if(con != null) con.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
            try {
                if(scn != null) scn.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}



