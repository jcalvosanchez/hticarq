package com.htic.arq.core.util;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.htic.suricata.api.SuricataBaseTest;
import com.htic.suricata.api.TestCase;
import com.htic.suricata.api.TestCasesIterator;

public class StringUtilsTest extends SuricataBaseTest {

	private static final String SURICATA_STRINGUTILS_PROPERTIES_FILEPATH	= "src/test/config/com/htic/arq/core/suricata-util-stringutils.properties";


	@BeforeClass
	public static void setUpClass() throws Exception {
		loadTestModuleFromPropertiesFile(SURICATA_STRINGUTILS_PROPERTIES_FILEPATH);
	}


	@Test
//	@SuricataTest(testModule=SURICATA_TESTMODULE, testSuite="removechar")
	public void removeCharTest() throws Exception {
		setTestModuleName("stringutils");
		setTestSuiteName("removechar");
		TestCase testCase = null;
		TestCasesIterator testCasesIterator = getTestCasesIterator();
		while (testCasesIterator.hasNext()) {
			testCase = (TestCase) testCasesIterator.next();
			String expected = (String) testCase.getData(getTestSourceProperty("result"));
			String actual	= StringUtils.removeChar((String)testCase.getData(getTestSourceProperty("stringchain")), ((String)testCase.getData(getTestSourceProperty("character"))).charAt(0));

			assertEquals(expected, actual);
		}
	}


//	@SuricataBeforeClass(parametersFilePath=SURICATA_STRINGUTILS_PROPERTIES_FILEPATH)
//	public static void setUpSuricataOneTime() throws Exception {}
//
//	@SuricataTest(testSuiteCode=TESTSUITE_STRINGUTILS_REMOVECHAR)
//	public void removeCharSuricataTest() throws Exception {
//		TestCase testCase = nextTestCase();
//		assertEquals(testCase.getData("result"), StringUtils.removeChar((String)testCase.getData("stringChain"), ((String)testCase.getData("character")).charAt(0)));
//	}
}