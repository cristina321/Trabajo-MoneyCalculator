package persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
    
    public static Connection loadConection(String path){
        try{
            DriverManager.registerDriver( new org.sqlite.JDBC());
            return DriverManager.getConnection( "jdbc:sqlite:"+ path);
        }
        catch(Exception exception){
            System.out.println("Error while trying to load the database");
            return null;
        }
        
    }
    
    
}