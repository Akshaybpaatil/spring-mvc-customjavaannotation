package com.practice.express.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourceCodeContraintValidator 
     implements ConstraintValidator<CourseCode, String>{

	private String courseprefix;
	
	@Override
	public void initialize(CourseCode theCourceCode) {
		courseprefix = theCourceCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result;
		
		if (theCode!=null) {
			result = theCode.startsWith(courseprefix);
		}else {
			result = true;
		}
		return result;
	}

}
