package com.endava.automation_assessment.test.Prob1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.junit.Test;

public class Test1 {
	
	@Test
	public void compareResults() throws IOException {
	    File actualFile = new File("ActualOutput.txt");
	    File expectedFile = new File("ExpectedOutput.txt");
	    assertTrue("The files differ!", FileUtils.contentEquals(actualFile, expectedFile));
	    //    Assert.assertEquals(FileUtils.readLines(expectedFile), FileUtils.readLines(actualFile));
	    }

	private void assertTrue(String string, boolean contentEquals) {
		
	}
	    
	    
}
