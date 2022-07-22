package com.app.banking;
import static utils
public class BankAccount {
	
	private int acctNo;
	
	private String cName;
	private AcType type
private LocalDate createDate;
private double balance;

public BankAccount(int acctNo, String cName,Actype type LocalDate createDate, double balance) {
	super();
	this.acctNo = acctNo;
	this.cName = cName;
	this.type=type;
	this.createDate = createDate;
	this.balance = balance;
}
@Override
public String toString() {
	return "BankAccount [acctNo=" + acctNo + ", cName=" + cName + ", balance=" + balance + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public void deposit(double amount)
{
	this.balance+=amount;
}
public void withdraw(double amount)
{
	this.balance-=amount;
}

public String AccountType(){
	return default;
}

}
