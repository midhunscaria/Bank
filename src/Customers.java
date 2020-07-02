import java.util.ArrayList;

public class Customers {
    private ArrayList<Double> transactions= new ArrayList<Double>();
    private String name;

    public Customers(String name, double trans) {

        this.name = name;
        addTrasncation(trans);
    }
    public void addTrasncation(double trns){
        this.transactions.add(Double.valueOf(trns));

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
