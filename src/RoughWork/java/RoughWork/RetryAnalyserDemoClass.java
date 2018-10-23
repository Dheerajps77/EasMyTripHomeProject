package RoughWork;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.QA.EasMyTrip.Utilities.retryAnalyzerClass;

public class RetryAnalyserDemoClass {

	int i = 0;

	@Test(retryAnalyzer=retryAnalyzerClass.class)
	public void test1() {

		i++;

		if (i <= 3) {
			System.out.println("Counter of i : " + i++);
			System.out.println(" Retrying ");
			Assert.assertEquals(false, true);
		}

		else {
			System.out.println(" Successfully executed now..");
			Assert.assertEquals(true, true);
		}

	}

	@Test(retryAnalyzer=retryAnalyzerClass.class)
	public void test2() {
		Assert.assertEquals(12, 13);
	}

	@Test(retryAnalyzer=retryAnalyzerClass.class)
	public void test3() {
		Assert.assertEquals(13, 13);
	}

	@Test
	public void test4() {
		Assert.assertEquals(12, 13);
	}
}
