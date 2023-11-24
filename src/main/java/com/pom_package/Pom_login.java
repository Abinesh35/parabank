package com.pom_package;

import com.base_package.BaseClass;
import org.openqa.selenium.By;

public class Pom_login extends BaseClass {
    public By log_username = By.xpath("(//input[@name=\"username\"])");
    public By log_password = By.xpath("(//input[@type=\"password\"])");
    public By loginBtn = By.xpath("//input[@value=\"Log In\"]");
}
