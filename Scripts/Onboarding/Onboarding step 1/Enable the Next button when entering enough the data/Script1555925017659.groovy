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

WebUI.callTestCase(findTestCase('User Authentication/Sign up - Frontpage/Able to Sign up in Frontpage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Onboarding/div_DropdownlistCityProvince'))

WebUI.click(findTestObject('Object Repository/Onboarding/span_Ho Chi Minh'))

WebUI.click(findTestObject('Onboarding/i_High school'))

WebUI.click(findTestObject('Onboarding/div_DropdownlistSchool'))

WebUI.click(findTestObject('Object Repository/Onboarding/span_Tran Quoc Thao High School'))

WebUI.click(findTestObject('Object Repository/Onboarding/button_Next'))

