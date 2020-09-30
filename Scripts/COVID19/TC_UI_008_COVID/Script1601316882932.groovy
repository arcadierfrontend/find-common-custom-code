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

WebUI.callTestCase(findTestCase('UTILITIES/Open Marketplace COVID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('COVID19 homepage object/a_SELF-COLLECTION KIT'))

WebUI.verifyElementText(findTestObject('COVID19 homepage object/a_SELF-COLLECTION KIT'), 'SELF-COLLECTION KIT')

WebUI.verifyElementClickable(findTestObject('COVID19 homepage object/a_SELF-COLLECTION KIT'))

WebUI.verifyElementAttributeValue(findTestObject('COVID19 homepage object/a_SELF-COLLECTION KIT'), 'href', 'https://covid19staging.test-arcadier.com/User/Search?categoryid=ec159711-7e06-4fc2-ab0c-4e8fadd132a0', 
    0)

