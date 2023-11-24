package com.step_def;

import com.base_package.BaseClass;
import com.pom_package.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class Step_def_class extends BaseClass {
    Pom_Register reg= new Pom_Register();
    Pom_login log = new Pom_login();

//    home page
    @Given("user launch the parabank website")
    public void user_launch_the_parabank_website() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
    }
    @Then("User click register")
    public void user_click_register() {
        driver.findElement(reg.register).click();
    }
    @When("User enter first name")
    public void user_enter_first_name() {
        driver.findElement(reg.firstName).sendKeys("msd");
    }

    @When("user enter Last name")
    public void user_enter_last_name() {
        driver.findElement(reg.lastName).sendKeys("msd");
    }

    @When("User enter Address")
    public void user_enter_address() {
        driver.findElement(reg.address).sendKeys("chennai");
    }

    @When("User enter city")
    public void user_enter_city() {
        driver.findElement(reg.city).sendKeys("tambaar");
    }

    @When("User enter state")
    public void user_enter_state() {
        driver.findElement(reg.state).sendKeys("Nadu");
    }

    @When("User enter Zipcode")
    public void user_enter_zipcode() {
        driver.findElement(reg.zipCode).sendKeys("60028");
    }

    @When("user enter phone number")
    public void user_enter_phone_number() {
        driver.findElement(reg.phoneNo).sendKeys("980124567");
    }

    @When("user enter SSN")
    public void user_enter_ssn() {
        driver.findElement(reg.ssn).sendKeys("98654120");
    }
    @When("User enter username")
    public void user_enter_username() {
        driver.findElement(reg.userName).sendKeys("leodhas70");
    }

    @When("User enter Password")
    public void user_enter_password() {
        driver.findElement(reg.password).sendKeys("hello");
    }

    @When("User confirmPassword")
    public void user_confirm_password() {
        driver.findElement(reg.confirm).sendKeys("hello");
    }

    @Then("User click register button")
    public void user_click_register_button() {
        driver.findElement(reg.registerBtn).click();
    }

//    Login page

//    @When("user enter username for login")
//    public void user_enter_username_for_login() {
//        driver.findElement(log.log_username).sendKeys("leodhas07");
//    }
//    @When("User enter password for login")
//    public void user_enter_password_for_login() throws InterruptedException {
//        driver.findElement(log.log_password).sendKeys("00001");
//        Thread.sleep(3000);
//    }
//    @Then("user click login")
//    public void user_click_login() throws InterruptedException, IOException {
//        driver.findElement(log.loginBtn).click();
//        Thread.sleep(3000);
//        screenshot(driver, "C:\\Users\\91960\\IdeaProjects\\Para_Bank\\screenshot_pics\\pic.png");
//    }

//    open new account

    Pom_openAccount acount = new Pom_openAccount();

    @When("user click open New Account")
    public void user_click_open_new_account() {
        driver.findElement(acount.newAccount).click();
    }
    @When("User select dropdown in account type")
    public void user_select_dropdown_in_account_type() {
        WebElement select = driver.findElement(acount.selectAccounttype);
        selectByIndex(select,1);
    }
    @Then("User click open new account Button")
    public void user_click_open_new_account_button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(acount.newAccountBtn).click();
    }

//    Fund Transfer
    Pom_FundTransfer fund = new Pom_FundTransfer();

    @When("User click transferFunds")
    public void user_click_transfer_funds() {
        driver.findElement(fund.fundTransfer).click();
    }
    @When("user enter the amount")
    public void user_enter_the_amount() {
        driver.findElement(fund.enterAmount).sendKeys("200");
    }

//    @When("user select to account")
//    public void user_select_to_account() {
//        WebElement ft = driver.findElement(fund.toAccount);
//        selectByIndex(ft, 1);
//    }
    @Then("User click transfer button")
    public void user_click_transfer_button() {
        driver.findElement(fund.transferBtn).click();
    }

    Pom_billpay bill = new Pom_billpay();

    @When("user click bill pay")
    public void user_click_bill_pay() {
        driver.findElement(bill.billpay).click();
    }
    @When("user enter Payee Name in billpay")
    public void user_enter_payee_name_in_billpay() {
       driver.findElement(bill.payee).sendKeys("leoleo");
    }
    @When("user enter Address in billpay")
    public void user_enter_address_in_billpay() {
       driver.findElement(bill.address).sendKeys("sharja");
    }
    @When("user enter City in billpay")
    public void user_enter_city_in_billpay() {
        driver.findElement(bill.city).sendKeys("kuruku sandhu");
    }
    @When("user enter State in billpay")
    public void user_enter_state_in_billpay() {
        driver.findElement(bill.state).sendKeys("chrompet");
    }
    @When("user enter Zip Code in billpay")
    public void user_enter_zip_code_in_billpay() {
        driver.findElement(bill.code).sendKeys("00000");
    }
    @When("user enter Phone no in billpay")
    public void user_enter_phone_no_in_billpay() {
        driver.findElement(bill.phone).sendKeys("955442455");
    }
    @When("user enter Account in billpay")
    public void user_enter_account_in_billpay() {
       driver.findElement(bill.account).sendKeys("32646156");
    }
    @When("user enter Verify Account in billpay")
    public void user_enter_verify_account_in_billpay() {
        driver.findElement(bill.verifyAcc).sendKeys("32646156");
    }
    @When("User enter Amount")
    public void user_enter_amount() {
        driver.findElement(bill.amount).sendKeys("200");
    }
    @Then("user click send button")
    public void user_click_send_button() {
        driver.findElement(bill.sendBtn).click();
    }


}
