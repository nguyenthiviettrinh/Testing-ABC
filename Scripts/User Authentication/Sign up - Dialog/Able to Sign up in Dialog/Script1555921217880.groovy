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

Date today = new Date()

String todaysDate = today.format('MMddyy-hhmmss')

String engagementName = 'auto_eng' + todaysDate

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.16.1.170:3461/home')

WebUI.click(findTestObject('User Authentication/Sign up - Dialog/a_Sign up'))

WebUI.setText(findTestObject('User Authentication/Sign up - Dialog/input_Full name_Dialog'), 'Full Name')

WebUI.setText(findTestObject('User Authentication/Sign up - Dialog/input_Email_Dialog'), engagementName + '@mailitor.com')

WebUI.setEncryptedText(findTestObject('User Authentication/Sign up - Dialog/input_Password_Dialog'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('User Authentication/Sign up - Dialog/input_Confirm Password_Dialog'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('User Authentication/Sign up - Dialog/checkbox__Sign Up_Dialog'))

WebUI.click(findTestObject('User Authentication/Sign up - Dialog/button_Sign up'))

