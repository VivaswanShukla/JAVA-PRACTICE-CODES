package com.codes;
import java.sql.*;
public class jdbc_2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

//            Creating a connection

            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "rounak7100");

//            Creating a query

            String s = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

//            Creating a statement

            Statement st = con.createStatement();
            st.executeUpdate(s);

            System.out.println("Table created");
            con.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
