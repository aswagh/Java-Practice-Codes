package com.sql.mysql.connection;
import java.sql.Connection;
import java.sql.DriverManager;
class ConnectionObject{
    public static Connection getJDBCConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","atul","guru");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}