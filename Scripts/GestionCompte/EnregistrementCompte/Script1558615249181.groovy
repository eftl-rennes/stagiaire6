import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Gender_Gender'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_First name_FirstName'), 'dussaucy')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Last name_LastName'), 'philippe')

Random rand = new Random()

int min = 10

int max = 200

int result = (rand.nextInt() * (max - min)) + min

mail = ''

mail = WebUI.concatenate(((['dussaucy.philippe', result, '@yopmail.com']) as String[]), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Email_Email'), mail)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Password_Password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Confirm password_ConfirmPassword'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/input__register-button'))

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Register/div_Your registration completed'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Register/div_Your registration completed'), 
    'Your registration completed')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/ClickContinue'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/a_Log out'))

WebUI.closeBrowser()

