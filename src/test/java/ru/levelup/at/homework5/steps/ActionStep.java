package ru.levelup.at.homework5.steps;

import org.openqa.selenium.WebDriver;
public class ActionStep extends BaseStep {

    public ActionStep(WebDriver driver) {
        super(driver);
    }

    public static void loginToMailRuService(String login, String password) {

        loginRegistrationPage.open();
        loginRegistrationPage.clickOnLoginButton();

        loginRegistrationPage.enterUsernameToUsernameField(login);
        loginRegistrationPage.sendEnterKeyToUsernameField();

        loginRegistrationPage.enterPasswordToPasswordField(password);
        loginRegistrationPage.sendEnterKeyToPasswordField();

        mainPage.closePromoPopup();
    }

    public static void createLetter(String addressee, String subject, String messageText) {
        mainPage.clickComposeLetterButton();
        mainPage.enterAddresseeToAddresseeField(addressee);
        mainPage.enterSubjectToSubjectField(subject);
        mainPage.enterMessageTextToMessageTextField(messageText);
    }

    public void saveLetter() {
        mainPage.clickSaveButton();
        mainPage.clickComposeLetterCloseButton();
    }

    public static void sendLetter() {
        mainPage.clickSendButton();
        mainPage.clickLetterSentCloseButton();
    }

    public static void logout() {
        mainPage.clickRightMenuButton();
        mainPage.clickLogoutButton();
    }

    public static int getListOfSentLettersCount() {
        mainPage.clickLeftMenuSentButton();
        return mainPage.getListOfLettersCount();
    }

    public int getListOfDraftLettersCount() {
        mainPage.clickLeftMenuDraftsButton();
        return mainPage.getListOfLettersCount();
    }

    public static int getListOfTestLettersCount() {
        mainPage.clickLeftMenuTestButton();
        return mainPage.getListOfLettersCount();
    }

    public static int getListOfReceivedLettersCount() {
        mainPage.clickLeftMenuInboxButton();
        return mainPage.getListOfLettersCount();
    }

    public static int getListOfDeletedLettersCount() {
        mainPage.clickLeftMenuTrashButton();
        return mainPage.getListOfLettersCount();
    }

    public void verifyNumberOfDraftLettersDecreaseByOne(int numberOfLettersBefore) {
        mainPage.clickLeftMenuDraftsButtonAndWaitForNumberOfLettersDecreaseByOne(numberOfLettersBefore);
    }

    public static void verifyNumberOfSentLettersIncreaseByOne(int numberOfLettersBefore) {
        mainPage.clickLeftMenuSentButtonAndWaitForNumberOfLettersIncreaseByOne(numberOfLettersBefore);
    }

    public static void verifyNumberOfTestLettersIncreaseByOne(int numberOfLettersBefore) {
        mainPage.clickLeftMenuTestButtonAndWaitForNumberOfLettersIncreaseByOne(numberOfLettersBefore);
    }

    public static void verifyNumberOfReceivedLettersIncreaseByOne(int numberOfLettersBefore) {
        mainPage.clickLeftMenuInboxButtonAndWaitForNumberOfLettersIncreaseByOne(numberOfLettersBefore);
    }

    public static void verifyNumberOfDeletedLettersIncreaseByOne(int numberOfLettersBefore) {
        mainPage.clickLeftMenuTrashButtonAndWaitForNumberOfLettersIncreaseByOne(numberOfLettersBefore);
    }

    public static void deleteLetter() {
        mainPage.clickDeleteButton();
    }
}
