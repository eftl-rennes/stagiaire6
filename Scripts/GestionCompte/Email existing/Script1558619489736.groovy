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

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Email_Email'), 'xxx123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Password_Password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Confirm password_ConfirmPassword'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/input__register-button'))

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Register/li_The specified email already exists'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Register/li_The specified email already exists'), 
    'The specified email already exists')

WebUI.takeScreenshot()

