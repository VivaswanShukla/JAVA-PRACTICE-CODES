package com.codes;
import java.sql.*;
public class jdbc_3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

//            Creating a connection

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");

            String s = "insert into table1(tName,tCity) values(?,?)";

//            Creating a PreparedStatement

            PreparedStatement pst = con.prepareStatement(s);
            pst.setString(1, "Vivaswan");
            pst.setString(2, "Dehradun");
            pst.executeUpdate();

            System.out.println("Edited");
            con.close();
        }

            catch(Exception e)
            {
                System.out.println(e);
            }

    }
}
