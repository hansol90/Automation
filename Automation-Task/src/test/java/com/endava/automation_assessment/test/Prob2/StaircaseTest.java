package com.endava.automation_assessment.test.Prob2;

import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import com.endava.automation_assessment.common.ReaderFile;
import com.endava.automation_assessment.common.WriterFile;
import com.endava.automation_assessment.prob2.Staircase;

public class StaircaseTest {

	@Test
	public void testSuccess() throws IOException, URISyntaxException {
		ReaderFile readerFile = new ReaderFile();
		String input = readerFile.readResourceFile("Prob2/Input.txt");
		Integer number = Integer.valueOf(input);

		
		String result = Staircase.computeStaircase(number);
		// System.out.println(result);

		WriterFile writerFile = new WriterFile();
		writerFile.writeToResourceFile(result, "Prob2/ActualOutput.txt");

		String expected = readerFile.readResourceFile("Prob2/ExpectedOutput.txt");
		assertThat(result, IsEqual.equalTo(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidInputNumber() {
		int negativeNumber = -1;
		Staircase.computeStaircase(negativeNumber);
	}

}
