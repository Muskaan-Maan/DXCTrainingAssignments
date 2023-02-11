package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class DeleteBook {

    public DeleteBook() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        // variables
        final String url = "jdbc:mysql:///dxc";
        final String user = "root";
        final String password = "Marc93Mrmm@123";

        // prepare SQL query
        String deleteQuery = "Delete from library where BookID = ?";


        Scanner scn = null;
        int n = 0;
        int bookId = 0;

        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;

        try {
            // create Scanner class object
            scn = new Scanner(System.in);

            // take number of students
            if(scn != null) {
                System.out.print("Enter Number of BookId's to be deleted : ");
                n = scn.nextInt();
            }

            // establish the connection
            con = DriverManager.getConnection(url, user, password);
            // create JDBC statement object


            // compile SQL query and store it in
            // PreparedStatement object
            if(con != null) {
                ps = con.prepareStatement(deleteQuery);
            }

            if(scn != null && ps != null) {
                for(int i=0; i<n; i++) {

                    // read input values
                    System.out.println("\nEnter BookId "+(i+1)+" : ");



                    System.out.print("BookID : ");
                    bookId = scn.nextInt();

                    // set parameters values
                    ps.setInt(1, bookId);


                    // execute the query
                    result = ps.executeUpdate();
                }
            }

            // process the result
            if(result == 0) {
                System.out.println("\nRecords deletion failed");
            } else {
                System.out.println("\nRecords deleted successfully.");
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
