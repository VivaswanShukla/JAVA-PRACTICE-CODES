package com.codes;
import java.sql.*;
public class jdbc_7 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");

            String s = "insert into Employee(Name,Salary,DOB) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, "Reet Sinha");
            ps.setString(2, "500000");
            ps.setString(3, "6032002");
            ps.executeUpdate();
            System.out.println("Done");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
