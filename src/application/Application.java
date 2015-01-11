package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.ExchangeOperation;
import java.sql.Connection;
import model.CurrencySet;
import mock.CurrencySetLoader;
import persistence.CreateConnection;
import sqlite.SqliteConnection;
import swing.ApplicationFrame;

public class Application {

    public static void main(String[] args) {
         
        Connection connection = CreateConnection.loadConection("money-calculator.db");
        SqliteConnection sqlite = new SqliteConnection(connection);
        CurrencySet currencySet = sqlite.load();
        ApplicationFrame frame = new ApplicationFrame(currencySet);
        
        frame.register("Calcular", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                new ExchangeOperation(frame.getDialog()).execute(sqlite);
            }    
        }); 
    }  
}
