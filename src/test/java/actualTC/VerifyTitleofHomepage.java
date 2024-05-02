package actualTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericUtilities.BaseClass;

public class VerifyTitleofHomepage extends BaseClass {
@Test   
public void TC() {
	String et="Swag Labs";
	String ht=wd.getTitle();
	Assert.assertEquals(et,ht,"Both are not matching");
	System.out.println("TC is pass");
}
}
