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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.selectOptionByValue(findTestObject('Page_Amazoncom Online Shopping for Electron_9e43a3/select_All Departments        Arts  Crafts _ae6888'), 
    'search-alias=electronics-intl-ship', true)

WebUI.setText(findTestObject('Page_Amazoncom Online Shopping for Electron_9e43a3/input_Search_field-keywords'), 'micro sd card')

WebUI.click(findTestObject('Page_Amazoncom Online Shopping for Electron_9e43a3/input_Go_nav-input'))

WebUI.click(findTestObject('Object Repository/Page_Amazoncom micro sd card International _ea8a31/i_Featured Brands_a-icon a-icon-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Amazoncom micro sd card - SanDisk Inte_92e00e/span_Under 25'))

WebUI.click(findTestObject('Object Repository/Page_Amazoncom micro sd card - Under 25  Sa_04b217/span_SanDisk 128GB Ultra microSDXC UHS-I Me_6ad1f2'))

WebUI.click(findTestObject('Page_Amazoncom SanDisk 128GB Ultra microSDX_44cd99/input_Qty_submitadd-to-cart'))

WebUI.verifyTextPresent('Added to Cart', false)

WebUI.closeBrowser()

