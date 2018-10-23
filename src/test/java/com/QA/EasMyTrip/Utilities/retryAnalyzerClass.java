package com.QA.EasMyTrip.Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzerClass implements IRetryAnalyzer {

	int counter = 0;
	private static final int maxCounter = 3;

	@Override
	public boolean retry(ITestResult result) {

		if (!result.isSuccess()) {
			if (counter < maxCounter) {
				counter++;
				result.setStatus(ITestResult.FAILURE);
				return true;
			} else {
				result.setStatus(ITestResult.FAILURE);
			}
		} else {
			result.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}
}