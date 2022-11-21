package com.codes;

import java.sql.*;
public class jdbc_1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");

//         Statement st = con.createStatement();
//         ResultSet rs = st.executeQuery("Select * from students ");
//         while (rs.next())
//         {
//             int id = rs.getInt("studentId");
//             String name  = rs.getString("studentName");
//             System.out.println(id);
//             System.out.println(name);
//         }
            if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection is created");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
