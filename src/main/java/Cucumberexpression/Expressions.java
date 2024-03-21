package Cucumberexpression;

import io.cucumber.java.en.Given;

public class Expressions {
	@Given("I have {int} laptop")
	public void iHaveLaptop(Integer int1) {
		System.out.println("the labtop count is:"+int1);
	    
	}
@Given("I have a {double} CGPA")
	public void iHaveACGPA(Double double1) {
	System.out.println("the CGPA is:"+double1);
	   
	}
	@Given("{string} is elder to {string} and {string}")
	public void isElderToAnd(String string, String string2, String string3) {
		System.out.println(string+"elder is" + string2 + "and" + string3);
	   
	}


}
