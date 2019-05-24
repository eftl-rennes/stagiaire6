import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/DemoWebShop')

suiteProperties.put('name', 'DemoWebShop')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\dussa\\Katalon Studio\\ManhattanProject\\Reports\\DemoWebShop\\20190523_164310\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/DemoWebShop', suiteProperties, [new TestCaseBinding('Test Cases/GestionCompte/EnregistrementCompte', 'Test Cases/GestionCompte/EnregistrementCompte',  null), new TestCaseBinding('Test Cases/GestionCompte/Email existing', 'Test Cases/GestionCompte/Email existing',  null), new TestCaseBinding('Test Cases/GestionCompte/no first name', 'Test Cases/GestionCompte/no first name',  null), new TestCaseBinding('Test Cases/GestionCompte/no mail', 'Test Cases/GestionCompte/no mail',  null), new TestCaseBinding('Test Cases/GestionCompte/no name', 'Test Cases/GestionCompte/no name',  null)])
