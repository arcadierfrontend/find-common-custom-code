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

WebUI.callTestCase(findTestCase('UTILITIES/Open Marketplace GDA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('GDA homepage object/a_NTD DIAGNOSTICS'))

WebUI.verifyElementText(findTestObject('GDA homepage object/a_NTD DIAGNOSTICS'), 'NTD DIAGNOSTICS')

WebUI.verifyElementClickable(findTestObject('GDA homepage object/a_NTD DIAGNOSTICS'))

WebUI.verifyElementAttributeValue(findTestObject('GDA homepage object/a_NTD DIAGNOSTICS'), 'href', 'https://gdastaging.test-arcadier.com/user/search?categoryid=e9eb5d81-8798-440f-975b-cf0baa7650ac&category=NTD%20diagnostics', 
    0)

