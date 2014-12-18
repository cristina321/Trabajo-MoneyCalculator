package model;

public class ExchangeRate {
    
private final Currency from, to;
    private final double rate;

    public ExchangeRate(Currency from, Currency to, double rate) {
        this.from = from;
        this.to= to;
        this.rate = rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getRate() {
        return rate;
    }

    public Currency getToCurrency() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}