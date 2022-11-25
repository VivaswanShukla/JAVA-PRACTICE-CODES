package com.codes;
import java.sql.*;
import java.util.*;
public class jdbc_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter emp_id");
            String s1 = sc.nextLine();
            int emp_id = Integer.parseInt(s1);
            System.out.println("Enter emp_name");
            String emp_name = sc.nextLine();
            System.out.println("Enter department");
            String dept = sc.nextLine();
            System.out.println("Enter the salary");
            String s2 = sc.nextLine();
            int salary = Integer.parseInt(s2);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String s = "insert into Employee1(emp_id,emp_name,dept,salary) values(?,?,?,?)";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");
                PreparedStatement pt = con.prepareStatement(s);
                pt.setInt(1, emp_id);
                pt.setString(2, emp_name);
                pt.setString(3, dept);
                pt.setInt(4, salary);
                pt.executeUpdate();
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Would you like to continue y/n");
            String inp = sc.nextLine();
            if(inp.equals("n"))
            {
                break;
            }
        }
    }
}
