package com.QA.EasMyTrip.Utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class iAnnotationListenerClass implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation iTestAnnoation, Class Class1, Constructor ConstructorClass, Method method) {
		
		iTestAnnoation.setRetryAnalyzer(retryAnalyzerClass.class);
	}

}
