package GitHubPractice;

import org.testng.annotations.Test;

//NOTE:
//class Name should end with test otherwise maven won't run that class 
public class GitHubPracticeTest {
	@Test
	public void gitHubPracticeTest() {
		System.out.println("Hiiiii Git");
		String value=System.getProperty("Browser");
		System.out.println(value);
	}
}
