package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con=null;
    public static Connection getConnect(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://local host:3306/IDBC_Bank", "root", "C@llofduty1");
        }catch(Exception e){
            System.out.println("An Error occurred while connecting!! \nError: "+e);
        }

        return con;
    }
}
