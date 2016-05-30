package com.endava.automation_assessment.test.Prob1;

import static com.endava.automation_assessment.prob1.Palindrome.builtResponse;
import static com.endava.automation_assessment.prob1.Palindrome.isPalindrome;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import com.endava.automation_assessment.common.ReaderFile;
import com.endava.automation_assessment.common.WriterFile;

public class PolindromeTest {

	@Test
	public void testSuccess() throws IOException, URISyntaxException {
		ReaderFile readerFile = new ReaderFile();
		String input = readerFile.readResourceFile("Prob1/Input.txt");

		WriterFile writerFile = new WriterFile();
		writerFile.writeToResourceFile(builtResponse(input, isPalindrome(input)), "Prob1/ActualOutput.txt");

		String expected = readerFile.readResourceFile("Prob1/ExpectedOutput.txt");
		String actual = readerFile.readResourceFile("Prob1/ActualOutput.txt");
		assertThat(actual, IsEqual.equalTo(expected));
	}
}
