package com.pom_package;

import com.base_package.BaseClass;
import org.openqa.selenium.By;

public class Pom_openAccount extends BaseClass {

    public By newAccount = By.xpath("(//a[text()='Open New Account'])");
    public By selectAccounttype = By.id("type");
    public By newAccountBtn = By.xpath("(//input[@type=\"submit\"])");

}
