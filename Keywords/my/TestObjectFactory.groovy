package my

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject


public class TestObjectFactory {

	static TestObject create(String expr) {
		TestObject tObj = new TestObject(expr)
		tObj.addProperty("xpath", ConditionType.EQUALS, expr)
		return tObj
	}
}
