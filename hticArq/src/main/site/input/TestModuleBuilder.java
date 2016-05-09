package com.htic.suricata.core.model;

import java.util.HashMap;
import java.util.Map;

import com.htic.suricata.api.TestModule;
import com.htic.suricata.api.TestSuite;

@Deprecated public class TestModuleBuilder {

	public static TestModule getInstance () {
		TestSuite testSuite;
		Map<String, TestSuite> testSuites	= new HashMap<String, TestSuite>();
		TestModule testModule = new TestModule();

		testSuite	= TestSuiteBuilder.getInstance(TestSuiteBuilder.TEST_SUITE_ADDING);
		testSuites.put(testSuite.getCode(), testSuite);

		testSuite	= TestSuiteBuilder.getInstance(TestSuiteBuilder.TEST_SUITE_LOGIN);
		testSuites.put(testSuite.getCode(), testSuite);

		testModule.setTestSuite(testSuites);

		return testModule;
	}
}