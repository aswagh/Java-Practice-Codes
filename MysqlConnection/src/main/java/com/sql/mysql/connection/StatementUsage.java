package com.sql.mysql.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementUsage {

        static Connection con = ConnectionObject.getJDBCConnection();
        static Statement statement;
        public static void main(String args[]){
            try{
                statement = con.createStatement();

//                String sqlQuery = "insert into student values (2, 'Hritvik', 'Patil')";
//                statement.execute(sqlQuery);

                String updateQuery = "update Student set last_name = 'Somani' where id = 2";
                statement.executeUpdate(updateQuery);
                String selectQuery = "select * from student";
                ResultSet set = statement.executeQuery(selectQuery);

                while(set.next()){
                    System.out.println(set.getInt(1)+"  "+set.getString(2)+" "+set.getString(3));
                }

            }catch (Exception e){
                e.printStackTrace();
            }
            finally {
            }

        }
}
