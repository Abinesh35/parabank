package com.pom_package;

import com.base_package.BaseClass;
import org.openqa.selenium.By;

public class Pom_billpay extends BaseClass {
    public By billpay = By.xpath("//a[text()='Bill Pay']");
    public By payee = By.xpath("//input[@name=\"payee.name\"]");
    public By address = By.xpath("//input[@name=\"payee.address.street\"]");
    public By city = By.xpath("//input[@name=\"payee.address.city\"]");
    public By state = By.xpath("//input[@name=\"payee.address.state\"]");
    public By code = By.xpath("//input[@name=\"payee.address.zipCode\"]");
    public By phone = By.xpath("//input[@name=\"payee.phoneNumber\"]");
    public By account = By.xpath("//input[@name=\"payee.accountNumber\"]");
    public By verifyAcc = By.xpath("//input[@name=\"verifyAccount\"]");
    public By amount = By.xpath("//input[@name=\"amount\"]");
    public By sendBtn = By.xpath("//input[@class=\"button\"]");
}
