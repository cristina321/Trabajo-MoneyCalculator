package persistence.oracle;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/*import javax.naming.spi.DirStateFactory;
import oracle.jdbc.OracleDriver;*/

public class Oracle {
    public static void main(String[] args) throws SQLException {
        String userName="system";
        String password="orcl";
        String server="localhost:101:orcl";
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        //jdbc:oracle:thin:@server,username,password
        Connection connection=DriverManager.getConnection("jdbc:orcl:thin:@"+server,userName,password);
        Statement statement =connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from cambio_eur_a");
        while(resultSet.next())
        printRegister(resultSet);
    }

    private static void printRegister(ResultSet set) throws SQLException {
        System.out.println(set.getInt(1));
        System.out.println(set.getInt(2));
    }
}

/*
import javax.naming.spi.DirStateFactory;
import oracle.jdbc.OracleDriver;
*/


    