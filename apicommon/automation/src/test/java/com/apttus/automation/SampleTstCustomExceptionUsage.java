package com.apttus.automation;

import com.google.common.base.Throwables;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.apttus.customException.CustomException;

/**
 * Unit test for simple customException Usage.
 */
public class SampleTstCustomExceptionUsage {



	@Test(description= "This is a sample test for custom exception",groups = { "sanity" , "regression"})
	public void Test1() throws Exception{
		
		try {
			
		int[] arr = {1,2,3,4};
		for(int i =0 ; i<=arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		}
		catch(Exception e) {		
			throw new CustomException(e);
		}
		
		
	}
	
}
	  
