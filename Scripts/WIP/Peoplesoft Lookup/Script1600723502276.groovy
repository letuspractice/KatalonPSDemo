import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Page_Sign In  Home at Azusa Pacific University/img'))

WebUI.setText(findTestObject('Object Repository/Page_Sign In  Home at Azusa Pacific University/input_APU NetId_userid'), 
    GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In  Home at Azusa Pacific University/input_Password_pwd'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_Sign In  Home at Azusa Pacific University/input_Guest Access_Submit'))


    WebUI.click(findTestObject('Object Repository/Page_Employee-facing registry content/a_Main Menu'))

    WebUI.click(findTestObject('Object Repository/Page_Employee-facing registry content/a_Campus Community'))

    WebUI.click(findTestObject('Object Repository/Page_Employee-facing registry content/a_Personal Information (Student)'))

    WebUI.click(findTestObject('Object Repository/Page_Employee-facing registry content/a_AddUpdate a Person'))

    WebUI.setText(findTestObject('Object Repository/Page_AddUpdate a Person/input_ID_STUDENT_SRCH_EMPLID'), 'XX0000014')

    'Used to avoid search ahead issue'
    WebUI.click(findTestObject('Object Repository/find existing value/Page_AddUpdate a Person/span_Find an Existing Value') 
        )

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Page_AddUpdate a Person/input_Case Sensitive_ICSearch'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_AddUpdate a Person/address_link'))


