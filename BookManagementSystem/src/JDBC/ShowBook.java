package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowBook {

    public ShowBook() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        // variables
        final String url = "jdbc:mysql:///dxc";
        final String user = "root";
        final String password = "Marc93Mrmm@123";

        // establish the connection
        Connection con = DriverManager.getConnection(url, user, password);
        // create JDBC statement object
        Statement st = con.createStatement();

        // prepare SQL query
        String showQuery = "SELECT * FROM library";

        // send and execute SQL query in Database software
        ResultSet rs = st.executeQuery(showQuery);

        // process the ResultSet object
        boolean flag = false;
        while (rs.next()) {
            flag = true;
            System.out.println("BookID : " + rs.getInt(1) + "\nTitle : " + rs.getString(2) +
                    "\nAuthor : " + rs.getString(3) + "\nEdition : " + rs.getString(4));
        }

        if (flag == true) {
            System.out.println("\nRecords retrieved and displayed");
        } else {
            System.out.println("Record not found");
        }
        // close JDBC objects
        rs.close();
        st.close();
        con.close();
    }
}
