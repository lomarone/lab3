import java.util.*;
import java.lang.*;

// The user’s last name
//The user’s first name
//The user's middle name
//The user’s date of birth
//A driver’s license number that consists of the first 5 characters of the last name plus 4 random digits.
//An expiration date which is the user’s birth date except for the year which should be 2028.

public class License {

	String LastName;
	String FirstName;
	String MiddleName;
	int Dob;
	String DlNum;
	int ExpDate;

	public License() {
		this.LastName = "Default";
		this.FirstName = "Default";
		this.MiddleName = "Default";
		this.Dob = 0;
		this.DlNum = "Default";
		this.ExpDate = 0;
	}

	public License(String lastName, String firstName, String middleName, int dob, String dlNum, int expDate) {
		this.LastName = lastName;
		this.FirstName = firstName;
		this.MiddleName = middleName;
		this.Dob = dob;
		this.DlNum = dlNum;
		this.ExpDate = expDate;
	}

	public void setLicense() {
		
	}

	public String toString() {
		
	}


}
