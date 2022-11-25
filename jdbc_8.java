package com.codes;
import java.sql.*;
import java.util.Scanner;

public class jdbc_8 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the emp_id");
//        int emp_id = sc.nextInt();
//        System.out.println("Enter the emp_name");
//        String emp_name = sc.nextLine();
//        System.out.println("Enter dept");
//        String dept = sc.nextLine();
//        System.out.println("Enter salary");
//        int salary = sc.nextInt();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");

            String s = "create table Employee1(emp_id int(10), emp_name varchar(10), dept varchar(10), salary int(10))";
            Statement st = con.createStatement();
            st.executeUpdate(s);
            System.out.println("Table created");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
