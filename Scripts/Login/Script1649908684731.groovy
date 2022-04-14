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

WebUI.navigateToUrl('https://www.cim-platform.com/')

WebUI.click(findTestObject('Object Repository/Login/Page_CIM-Platform/svg__MuiSvgIcon-root MuiSvgIcon-fontSizeMed_ee5702'))

WebUI.click(findTestObject('Object Repository/Login/Page_CIM-Platform/li_Login'))

WebUI.navigateToUrl('https://www.cim-platform.com/login?id=true')

WebUI.setText(findTestObject('Object Repository/Login/Page_CIM-Platform/input__id'), 'sym0417@midasit.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_CIM-Platform/input__pw'), 'ZEo4Vco00nj1o3xKOviDnw==')

WebUI.click(findTestObject('Object Repository/Login/Page_CIM-Platform/button_'))

WebUI.click(findTestObject('Object Repository/Login/Page_CIM-Platform/div_CIM25 min'))

WebUI.closeBrowser()

