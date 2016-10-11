package Account;

import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestrate = 0;
	private Date dateCreated;
	
	
	public Account() {
		this.id = id;
		this.balance = balance;
		this.annualInterestrate = annualInterestrate;
		dateCreated = new Date();
	}
	
	public int getid(){
		return id;
		
	}
	
	public void setid(int id){
		this.id = id;
		
	}
	public double getbalance(){
		return balance;
		
	}
	public void setbalance(double balance){
		this.balance = balance;
		
	}
	public double getannualinterestrate(){
		return annualInterestrate;
		
	}
	public void setannualinterestrate(double annualInterestrate){
		this.annualInterestrate = annualInterestrate;
		
	}
	public Date getdatecreated(){
		return dateCreated;
		
	}
	public double getMonthlyinterestrate(){
		return annualInterestrate/12;
	}
	

	public double withdraw(double amount) throws InsufficientFundsException
	{
		if ((balance - amount) >= 0) {
			balance = balance - amount;
			return balance;
		}
		else{
			throw new InsufficientFundsException(amount);
		}
			
	}
	
	public double deposit(double amount){
		balance += amount;
		return balance;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

