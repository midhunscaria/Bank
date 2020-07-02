import java.util.ArrayList;

public class Branch {
    Customers customer= new Customers("Test",12.0);
    boolean flag=false;
    private String branchName;
    public ArrayList<Customers> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers=new ArrayList<Customers>();
    }

    public String getBranchName() {
        return branchName;
    }


    public void addCustomer(String name, double trans){
        customers.add(new Customers(name,trans));
        System.out.println("Customer Added");
    }
    public void addTransaction(String name, double transAmount){
        for(int i=0;i<customers.size();i++){
            customer=customers.get(i);
            if(customer.getName().equals(name)){
                customer.addTrasncation(transAmount);
                flag= true;
                System.out.println("Transcation added to customer "+customer.getName());
                printTransactions(customer);
            }
        }
        if (flag==false){
            System.out.println("Customer not found");
        }


    }
    public static void printTransactions(Customers customers){

        System.out.println(customers.getTransactions());
    }

}
