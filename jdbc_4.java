package com.codes;
import java.sql.*;
public class jdbc_4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            creating a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");
//            creating a query
            String s = "create table table2(Student varchar(10), Course varchar(10), Roll int(10))";
//            creating a Statement
            Statement st = con.createStatement();
            st.executeUpdate(s);

            System.out.println("Table Created");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
