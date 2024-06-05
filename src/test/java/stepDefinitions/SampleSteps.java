package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleSteps {

@Given("I want to write a step with name1")
public void i_want_to_write_a_step_with_name1() {
	// Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	System.out.println("inside step-> want to write name");
}

@When("I check for the {int} in step")
public void i_check_for_the_in_step(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	System.out.println("inside step-> want to check number of steps");
}

@Then("I verify the success in step")
public void i_verify_the_success_in_step() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	System.out.println("inside -> I verify the success in step");
}

@Given("I want to write a step with name2")
public void i_want_to_write_a_step_with_name2() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	System.out.println("inside -> I want to write a step with name2");
}

@Then("I verify the Fail in step")
public void i_verify_the_fail_in_step() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	System.out.println("inside -> I verify the Fail in step");
}

}
