package com.codes;
import java.sql.*;
public class jdbc_5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            Creating a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");

            String s = "insert into table3(Student,Course,Roll) values(?,?,?)";
//            Creating a Prepared Statement
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, "Reet Sinha");
            ps.setString(2, " Metallurgy");
            ps.setInt(3, 500094067);
            ps.executeUpdate();
            System.out.println("Entry Done");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
