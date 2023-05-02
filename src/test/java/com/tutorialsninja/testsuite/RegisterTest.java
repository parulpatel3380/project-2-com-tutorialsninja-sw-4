package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    MyAccountPage myAccountPage= new MyAccountPage();
    RegisterPage registerPage= new RegisterPage();


    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnRegisterOption("Register");
        registerPage.enterFirstName("Khushbu MaheshBhai");
        registerPage.enterLastName("Chaudhari");
        registerPage.enterEmail("kmchaudhari1234@gmail.com");
        registerPage.enterTelephoneNumber("1234567890");
        registerPage.enterPassword("KmChaudhari12");
        registerPage.enterConfirmPassword("KmChaudhari12");
        registerPage.clickOnSubscribeRadioButton();
        registerPage.checkPrivacyPolicyCheckBox();
        registerPage.ClickOnContinueButton();
        Assert.assertEquals(registerPage.accountCreatedMessageText(),"Your Account Has Been Created!");
        registerPage.ClickOnAccountCreatedContinueButton();
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnLogOut("Logout");
        Assert.assertEquals(myAccountPage.getAccountLogOutText(),"Account Logout");
        myAccountPage.clickOnAccountContinueButton();








    }


}
