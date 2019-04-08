import java.util.ArrayList;

public class Customer {
int customerID;
String Firstname;
double credit;
public Customer() {
	ArrayList accounts = new ArrayList<>();
}

public int getCustomerID() {
	return customerID;
}

public void setCustomerID(int customerID) {
	this.customerID = customerID;
}

public String getFirstname() {
	return Firstname;
}

public void setFirstname(String firstname) {
	Firstname = firstname;
}
}
