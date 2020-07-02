import java.util.ArrayList;

public class Bank {

    public static ArrayList<Branch> branches= new ArrayList<Branch>();
    public static void main(String[] args){
        addNewBranch("Limerick");
        branches.get(0).addCustomer("Ashwin",500.0);
        branches.get(0).addTransaction("Ashwin",200.50);
       // System.out.println("Transcation "+branches.get(0).printTransactions(););
        System.out.println(branches.get(0).getBranchName());

        }
        public static void addNewBranch(String branchName){
        Branch branch= new Branch(branchName);
        branches.add(branch);


        }
    }
