package com.htic.suricata.core.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.htic.arq.people.model.User;
import com.htic.suricata.api.TestCase;
import com.htic.suricata.api.TestSuite;
import com.htic.suricata.core.model.TestCaseAttribute;

@Deprecated public class TestSuiteBuilder {

	public final static int TEST_SUITE_ADDING	= 1;
	public final static int TEST_SUITE_LOGIN	= 2;


	public static TestSuite getInstance (int instanceType) {
		TestSuite testSuite = null;

		switch (instanceType) {
		case TEST_SUITE_ADDING:
			testSuite = getInstanceAdding();
			break;
		case TEST_SUITE_LOGIN:
			testSuite = getInstanceLogin();
		}

		return testSuite;
	}


	private static TestSuite getInstanceAdding() {
		Map<String, TestCase> testCases;
		TestCase testCase;
		Map<String, Object> data;

		TestSuite testSuite = new TestSuite ();
		List<TestCaseAttribute> testCaseAttributes = new ArrayList<TestCaseAttribute>();
		TestCaseAttribute testCaseAttribute = new TestCaseAttribute();

		//Header
		testSuite.setCode("TS-01.01");
		testSuite.setDescription("Add Test");
		testSuite.setObservations("This test simulates an \"adding\" feature in order to test com.arq.htic.testing module. Used for testing java.lang.Integer simple types.");

		testCaseAttribute.setCategory("Data Input");
		testCaseAttribute.setVarName("input1");
		testCaseAttribute.setPackageName(null);
		testCaseAttribute.setClassName(null);
		testCaseAttribute.setAttributeName(null);
		testCaseAttribute.setAttributeType("Integer");
		testCaseAttributes.add(testCaseAttribute);

		testCaseAttribute.setCategory("Data Input");
		testCaseAttribute.setVarName("input2");
		testCaseAttribute.setPackageName(null);
		testCaseAttribute.setClassName(null);
		testCaseAttribute.setAttributeName(null);
		testCaseAttribute.setAttributeType("Integer");
		testCaseAttributes.add(testCaseAttribute);

		testCaseAttribute.setCategory("Data Output");
		testCaseAttribute.setVarName("result");
		testCaseAttribute.setPackageName(null);
		testCaseAttribute.setClassName(null);
		testCaseAttribute.setAttributeName(null);
		testCaseAttribute.setAttributeType("Integer");
		testCaseAttributes.add(testCaseAttribute);

		testSuite.setTestCaseAttributes(testCaseAttributes);

		//Data
		testCases	= new HashMap<String, TestCase>();
		testCase	= new TestCase();
		data		= new HashMap<String, Object> ();
		data.put("input1", new Integer(0));
		data.put("input2", new Integer(0));
		data.put("result", new Integer(0));
		testCase.setData(data);
		testCase.setCode("1.0");
		testCases.put(testCase.getCode(), testCase);

		testCase	= new TestCase();
		data		= new HashMap<String, Object> ();
		data.put("input1", new Integer(1));
		data.put("input2", new Integer(1));
		data.put("result", new Integer(2));
		testCase.setData(data);
		testCase.setCode("2.0");
		testCases.put(testCase.getCode(), testCase);

		testCase	= new TestCase();
		data		= new HashMap<String, Object> ();
		data.put("input1", new Integer(2));
		data.put("input2", new Integer(2));
		data.put("result", new Integer(4));
		testCase.setData(data);
		testCase.setCode("3.0");
		testCases.put(testCase.getCode(), testCase);

		testSuite.setTestCasesData(testCases);

		return testSuite;
	}

	private static TestSuite getInstanceLogin() {
		Map<String, TestCase> testCases;
		TestCase testCase;
		Map<String, Object> data;
		User user;
		TestSuite testSuite = new TestSuite ();
		List<TestCaseAttribute> testCaseAttributes = new ArrayList<TestCaseAttribute>();
		TestCaseAttribute testCaseAttribute = new TestCaseAttribute();

		//Header
		testSuite.setCode("TS-01.02");
		testSuite.setDescription("Login Test");
		testSuite.setObservations("This test simulates an \"login\" feature in order to test com.arq.htic.testing module. Used for testing bean java.lang.String attributes population.");

		testCaseAttribute.setCategory("Data Input");
		testCaseAttribute.setVarName("user");
		testCaseAttribute.setPackageName("com.htic.arq.core.model");
		testCaseAttribute.setClassName("User");
		testCaseAttribute.setAttributeName("username");
		testCaseAttribute.setAttributeType("String");
		testCaseAttributes.add(testCaseAttribute);

		testCaseAttribute.setCategory("Data Input");
		testCaseAttribute.setVarName("user");
		testCaseAttribute.setPackageName("com.htic.arq.core.model");
		testCaseAttribute.setClassName("User");
		testCaseAttribute.setAttributeName("password");
		testCaseAttribute.setAttributeType("String");
		testCaseAttributes.add(testCaseAttribute);

		testCaseAttribute.setCategory("Data Output");
		testCaseAttribute.setVarName("result");
		testCaseAttribute.setPackageName(null);
		testCaseAttribute.setClassName(null);
		testCaseAttribute.setAttributeName(null);
		testCaseAttribute.setAttributeType("Boolean");
		testCaseAttributes.add(testCaseAttribute);

		testSuite.setTestCaseAttributes(testCaseAttributes);

		//Data
		testCases	= new HashMap<String, TestCase>();
		testCase	= new TestCase();
		data		= new HashMap<String, Object> ();
		user = new User();
		user.setUsername("pjackson");
		user.setPassword("1234");
		data.put("user", user);
		data.put("result", new Boolean(false));
		testCase.setData(data);
		testCase.setCode("1.0");
		testCases.put(testCase.getCode(), testCase);

		testCase	= new TestCase();
		data		= new HashMap<String, Object> ();
		user = new User();
		user.setUsername("mgasol");
		user.setPassword("4321");
		data.put("user", user);
		data.put("result", new Boolean(false));
		testCase.setData(data);
		testCase.setCode("2.0");
		testCases.put(testCase.getCode(), testCase);

		testCase	= new TestCase();
		data		= new HashMap<String, Object> ();
		user = new User();
		user.setUsername("jcalvo");
		user.setPassword("1111");
		data.put("user", user);
		data.put("result", new Boolean(true));
		testCase.setData(data);
		testCase.setCode("3.0");
		testCases.put(testCase.getCode(), testCase);

		testSuite.setTestCasesData(testCases);

		return testSuite;
	}
}