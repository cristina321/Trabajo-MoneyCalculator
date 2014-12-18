package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.ExchangeOperation;
import model.CurrencySet;
import mock.CurrencySetLoader;
import swing.ApplicationFrame;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        ApplicationFrame frame = new ApplicationFrame(currencySet);
        frame.register("Calcular", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                new ExchangeOperation(frame.getDialog()).execute();
            }
            
        });
    }
    
}
