package com.endava.automation_assessment.test.Prob3;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import com.endava.automation_assessment.common.ReaderFile;
import com.endava.automation_assessment.common.WriterFile;
import com.endava.automation_assessment.prob3.ReverseArray;

public class ReverseArrayTest {

	@Test
	public void testReverseSuccess() throws IOException, URISyntaxException {
		List<Double> inputList = new ArrayList<>();
		ReaderFile readerFile = new ReaderFile();
		String input = readerFile.readResourceFile("Prob3/Input.txt");
		String[] strNumbers = input.split(" ");
		for (String str : strNumbers) {
			inputList.add(Double.valueOf(str));
		}
		
		List<Double> result = ReverseArray.reverseList(inputList);
		
		System.out.println(result);
		
		WriterFile writerFile = new WriterFile();
		writerFile.writeToResourceFile(result, "Prob3/ActualOutput.txt");

		String expected = readerFile.readResourceFile("Prob3/ExpectedOutput.txt");
		String actual = readerFile.readResourceFile("Prob3/ActualOutput.txt");
		assertThat(actual.trim(), IsEqual.equalTo(expected.trim()));
	}

}
