package control;

import ui.ExchangeDialog;
import javax.swing.JOptionPane;
import model.ExchangeRate;
import model.Money;
import process.Exchanger;
import sqlite.SqliteConnection;
import ui.ExchangeDialog;

public class ExchangeOperation {
    
    private ExchangeDialog dialog;
    
    public ExchangeOperation(ExchangeDialog dialog) {
        this.dialog = dialog;
    }

    public void execute( SqliteConnection sqlite) {
        
        ExchangeRate exchangeRate = sqlite.getExchangeRate(
                dialog.getExchange().getMoney().getCurrency(), 
                dialog.getExchange().getCurrency());
        
        Money money = Exchanger.exchangeRate(dialog.getExchange().getMoney(), exchangeRate);
       
        JOptionPane.showMessageDialog(null, money); 
    }
}
