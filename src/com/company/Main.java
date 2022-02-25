package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root";
        Class.forName("com.mysql.jdbc.Driver");
        
        String name = "DonLon";
        String userpassword ="dancik";
        String phone ="89148941839";

        try {
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection is successful");
            Statement stm = con.createStatement();
            stm.executeUpdate("INSERT INTO `users` (`id`, `name`, `password`, `phone`) VALUES (NULL,'"+name+"', '"+userpassword+"', '"+phone+"')");
            con.close();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
