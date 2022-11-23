package com.codes;
import java.sql.*;
public class jdbc_6 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");

            String s = "create table Employee(Name varchar(400), Salary int(200), DOB int(200))";

            Statement st = con.createStatement();
            st.executeUpdate(s);
            System.out.println("SUCCESS");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
