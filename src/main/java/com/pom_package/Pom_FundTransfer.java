package com.pom_package;

import com.base_package.BaseClass;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class Pom_FundTransfer extends BaseClass {
    public By fundTransfer = By.xpath("//a[text()='Transfer Funds']");
    public By enterAmount = By.id("amount");
    public By toAccount = By.xpath("id=\"toAccountId\"");
    public By transferBtn = By.xpath("//input[@type=\"submit\"]");

}
