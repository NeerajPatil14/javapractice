
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to our shop..");
		/*
		 * BankAccount ba = new BankAccount();
		 * 
		 * ba.setBankAccount(101, "Julie", 500000); ba.showBankAccount();
		 * 
		 * ba.withdraw(3000); ba.showBankAccount();
		 * 
		 * ba.deposit(90000); ba.showBankAccount();
		 */
		OrderDetails oa= new OrderDetails();
		oa.makeOrder(201,"12-12-2012",2,"Albert","Mumbai",88,"Cupboard","Lacquer",1000,5);
		oa.showIDetails();
		oa.showCustomerDetails();
		oa.showCatalog();
		oa.calculateTotalCost();
	}

}

class BankAccount {

	int bankAccountNumber; // data member
	String bankAccountHolder; // data member
	double bankAccountBalance; // data member

	// member function
	void setBankAccount(int acno, String name, double bal) {
		System.out.println("Setting BankDetails...");
		bankAccountNumber = acno;
		bankAccountHolder = name;
		bankAccountBalance = bal;
	}

	// member function
	void showBankAccount() {
		System.out.println("ACNO : " + bankAccountNumber);
		System.out.println("NAME : " + bankAccountHolder);
		System.out.println("BAL  : " + bankAccountBalance);
	}

	// member function
	void withdraw(double amountToWithdraw) {
		System.out.println("Withdrawing...." + amountToWithdraw);
		bankAccountBalance = bankAccountBalance - amountToWithdraw;
	}

	// member function
	void deposit(double amountToDeposit) {
		System.out.println("Depositing...." + amountToDeposit);
		bankAccountBalance = bankAccountBalance + amountToDeposit;
	}

}

class OrderDetails {

	int Order_ID; // data member
	String Order_Date; // data member
	int Customer_ID; // data member
	String Customer_Name; // data member
	String Customer_Address; // data member
	int Product_ID;// data member
	String Product_Description;// data member
	String Product_Finish;// data member
	int Unit_Product_Price;// data member
	int Order_Quantity;// data member
	// member function

	void makeOrder(int Order_ID1, String Order_Date1, int Customer_ID1, String Customer_Name1, String Customer_Address1,
			int Product_ID1, String Product_Description1, String Product_Finish1, int Unit_Product_Price1,
			int Order_Quantity1) {
		System.out.println("Making an order...");
		Order_ID = Order_ID1;
		Order_Date = Order_Date1;
		Customer_ID = Customer_ID1;
		Customer_Name = Customer_Name1;
		Customer_Address = Customer_Address1;
		Product_ID = Product_ID1;
		Product_Description = Product_Description1;
		Product_Finish = Product_Finish1;
		Unit_Product_Price = Unit_Product_Price1;
		Order_Quantity = Order_Quantity1;
	}

	void showIDetails() {
		System.out.println("............Showing Order details............");
		System.out.println("Order ID : " + Order_ID);
		System.out.println("Order Date : " + Order_Date);
		System.out.println("Order Quantity: " + Order_Quantity);
		System.out.println("Customer ID  : " + Customer_ID);
		System.out.println("Customer Name : " + Customer_Name);
		System.out.println("Customer Address: " + Customer_Address);

	}

	void showCustomerDetails() {
		System.out.println("............Showing customer details............");
		System.out.println("Customer ID  : " + Customer_ID);
		System.out.println("Customer Name : " + Customer_Name);
		System.out.println("Customer Address: " + Customer_Address);

	}

	void showCatalog() {
		System.out.println("............Displaying Catalog............");
		System.out.println("Product ID  : " + Product_ID);
		System.out.println("Product Description : " + Product_Description);
		System.out.println("Product Finish: " + Product_Finish);
		System.out.println("Unit Product Price  : " + Unit_Product_Price);
	}

	void calculateTotalCost() {
		int total;
		total = Order_Quantity * Unit_Product_Price;
		System.out.println("-----------Total cost is  : " + total);

	}

}
