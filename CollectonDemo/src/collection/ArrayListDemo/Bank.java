package collection.ArrayListDemo;
import java.util.ArrayList;

class Account
{
	Integer Accno;
	String AccName;
	Double Bal;
	public Account(Integer Accno , String AccName ,Double Bal) {
		
		this.AccName=AccName;
		this.Accno=Accno;
		this.Bal =Bal;
		
	}
}
public class Bank {
	
static ArrayList<Account> accList = new ArrayList<>();
	
public ArrayList<Integer> getAllAccountNumbers()
{
	ArrayList<Integer> accountNumbers = new ArrayList<>();
	
	for (int i = 0; i < accList.size(); i++) {
		
		accountNumbers.add(accList.get(i).Accno);
		
	}
	
	return accountNumbers;
	
}
	

public void addAccount(ArrayList<Account> accList ,Account Acc){
		
		accList.add(Acc);
		
		
			
			System.out.println("Account Number is :"+Acc.Accno);
			System.out.println("Account holder name is :"+Acc.AccName);
			System.out.println("Account Balance is :" +Acc.Bal);
			
			System.out.println("Account added Suceessfully");
			System.out.println("=======================================");
			
	
		
			
	}
	
	
	public void getAccountDetails(Integer accno)
	{
		Boolean accStatus =false;
		
		System.out.println("=========Account Details=================");
		
		for (int i = 0; i < accList.size(); i++) {
			
			if (accList.get(i).Accno.equals(accno)) {
				
				System.out.println("Account Number is :"+accList.get(i).Accno);
				System.out.println("Account holder name is :"+accList.get(i).AccName);
				System.out.println("Account Balance is :" +accList.get(i).Bal);
				
				accStatus =true;
				
				System.out.println("========================================");
			} 
		}
		
		if (accStatus==false) {
			
			System.out.println("Account Number doesn't exists :"+accno);
			System.out.println("========================================");
		}
		
		
			
	}
	
	public void deleteAccount(Integer accno)
	{
		Boolean removestatus =false;
		
		System.out.println("=========Account Removal=================");
		for (int i = 0; i < accList.size(); i++) {
			
			if(accList.get(i).Accno.equals(accno)){
				
				accList.remove(i);
				
				removestatus =true;
				
		System.out.println("Account deleted successfully :"+accno);		
		System.out.println("========================================");		
			}
			
		}
		
		if (removestatus==false){
			
			System.out.println("Account Number doesn't exists :"+accno);
			System.out.println("========================================");
		}
		
	}
	
	
	public void accountUpdate(Integer accno,Double newbalance)
	{
		
		Boolean updateStatus =false;
		
		System.out.println("=========Account Update=================");
		
		for (int i = 0; i < accList.size(); i++) {
			
			if(accList.get(i).Accno.equals(accno)){
				
				accList.get(i).Bal=newbalance;
				
				getAccountDetails(accno);
				System.out.println("Account updates successfully :"+accno);		
				System.out.println("========================================");	
				
				
				updateStatus=true;
			}
			
		}
		
	if (updateStatus==false){
			
			System.out.println("Account Number doesn't exists :"+accno);
			System.out.println("========================================");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		Bank bank= new Bank();
		
		Account acc1 = new Account(1010, "Upender", 1000.70);
	
		
		bank.addAccount(accList, acc1);
		bank.addAccount(accList,  new Account(9999, "abc", 88899.00));
		bank.addAccount(accList,  new Account(8888, "lmn", (double) 12345));
		bank.addAccount(accList,  new Account(5555, "pqr", new Double(147852) ));
		bank.addAccount(accList,  new Account(9999, "abc", 88899.00));
		
		bank.getAccountDetails(9999);
		bank.getAccountDetails(3333);
		bank.getAccountDetails(1021);
		
		bank.deleteAccount(5555);
		bank.deleteAccount(18975);
		
		bank.accountUpdate(8888, 500000.00);
		bank.accountUpdate(33333, 500000.00);
		
		System.out.println(bank.getAllAccountNumbers());
		
		
		
	}
}

