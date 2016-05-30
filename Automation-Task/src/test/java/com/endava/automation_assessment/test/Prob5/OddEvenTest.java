package com.endava.automation_assessment.test.Prob5;

import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import com.endava.automation_assessment.common.ReaderFile;
import com.endava.automation_assessment.common.WriterFile;
import com.endava.automation_assessment.prob5.OddEvenNumbers;

public class OddEvenTest {

	@Test
	public void testOddEvenSuccess() throws IOException, URISyntaxException {
		List<Integer> inputList = new ArrayList<>();
		ReaderFile readerFile = new ReaderFile();
		String input = readerFile.readResourceFile("Prob5/Input.txt");
		String[] strNumbers = input.split(" ");
		for (String str : strNumbers) {
			inputList.add(Integer.valueOf(str));
		}
		
		List<Integer> result = OddEvenNumbers.compute(inputList);
		
		System.out.println(result);
		WriterFile writerFile = new WriterFile();
		writerFile.writeToResourceFileNumbers(result, "Prob5/ActualOutput.txt");

		String expected = readerFile.readResourceFile("Prob5/ExpectedOutput.txt");
		String actual = readerFile.readResourceFile("Prob5/ActualOutput.txt");
		assertThat(actual.trim(), IsEqual.equalTo(expected.trim()));
	}

}
