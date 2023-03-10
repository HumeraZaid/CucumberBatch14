package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "middleName")
    public WebElement middleNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "photofile")
    public WebElement photograph;

    @FindBy(id = "chkLogin")
    public WebElement checkBox;

    @FindBy(id = "user_name")
    public WebElement createusernameField;

    @FindBy(id = "user_password")
    public WebElement createpasswordField;

    @FindBy(id = "re_password")
    public WebElement confirmpasswordField;

    @FindBy(id = "employeeId")
    public WebElement empIdLocator;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    public AddEmployeePage(){

        /* Page factory is the concept of Selenium, which we use to implement page
        object model design pattern that is responsible to initialize all the objects
        of the class. Here when we say objects, we mean locators what we also call
        object repository. If someone ask this to you in the interview, you have to write the same thing.
        */

        PageFactory.initElements(driver, this);
    }

}
