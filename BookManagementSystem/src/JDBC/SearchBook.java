package JDBC;

import java.sql.*;
import java.util.Scanner;


public class SearchBook {

    public SearchBook() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        // variables
        final String url = "jdbc:mysql:///dxc";
        final String user = "root";
        final String password = "Marc93Mrmm@123";


        // prepare SQL query
        String searchQuery = "SELECT * FROM library where Author = ?";


        Scanner scn = null;
        int n = 0;
        String author = null;


        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean flag = false;

        try {
            // create Scanner class object
            scn = new Scanner(System.in);

            // take number of students
            if (scn != null) {
                System.out.print("Enter Number of Authors to be searched : ");
                n = scn.nextInt();
            }

            // establish the connection
            con = DriverManager.getConnection(url, user, password);
            // create JDBC statement object


            // compile SQL query and store it in
            // PreparedStatement object
            if (con != null) {
                ps = con.prepareStatement(searchQuery);
            }

            if (scn != null && ps != null) {
                for (int i = 0; i < n; i++) {

                    // read input values
                    scn.nextLine();
                    System.out.println("\nEnter Author " + (i + 1) + " : ");
                    author = scn.nextLine();

                    // set parameters values
                    ps.setString(1, author);


                    // execute the query
                    // send and execute SQL query in Database software
                    rs = ps.executeQuery();
                    // process the ResultSet object

                    while (rs.next()) {
                        flag = true;
                        System.out.println("BookID : " + rs.getInt(1) + "\nTitle : " + rs.getString(2) +
                                "\nAuthor : " + rs.getString(3) + "\nEdition : " + rs.getString(4));
                    }
                }
            }





        if (flag == true) {
            System.out.println("\nRecords retrieved and displayed");
        } else {
            System.out.println("Record not found");
        }
    }catch(SQLException se) {
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
                if(rs != null) rs.close();
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
        // close JDBC objects
         //   rs.close();
         //   st.close();
       // con.close();


