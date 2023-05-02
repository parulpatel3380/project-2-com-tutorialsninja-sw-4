package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    MyAccountPage myAccountPage = new MyAccountPage();
    RegisterPage registerPage= new RegisterPage();
    LoginPage loginPage = new LoginPage();
    //"kmchaudhari1234@gmail.com"
//KmChaudhari12
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnLoginOption("Login");
        loginPage.enterEmail("parulpatel3380@gmail.com");
        loginPage.enterPassword("primetesting123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getLoginTextSuccessfully(), "My Account");
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnLogOut("Logout");
        Assert.assertEquals(myAccountPage.getAccountLogOutText(), "Account Logout");
        myAccountPage.clickOnAccountContinueButton();
    }

    }
