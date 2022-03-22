import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ExamPaper {
	// Define all the data members and methods here
	private String correct;
	private String question;

	public ExamPaper(String correct, String question) {
		this.correct = correct;
		this.question = question;
	}

	public void setCorrect(String correct) {
		this.correct = correct;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getCorrect() {
		return correct;
	}

	public String getQuestion() {
		return question;
	}

	public String examChecker(int[] solution) {
//		String qString =
//		String[] splString = getCorrect().split("\\s");
		System.out.println(splString.length);
		String convString = splString.toString();
		for(int i=0;i<splString.length;i++) {
			
		}
		
//				
//				
//				
//			}
//		}
		if (solution.length != splString.length)
			return "Fail";
		return "Partially passed";

	}

	public boolean checkLength(int[] solution) {
		String[] qCorrect = getCorrect().split("\\s");
		if (qCorrect.length == solution.length) {
			return true;
		} else {
			return false;
		}
	}
}

public class prac1 {

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		String correct = "Hi my name";
		String question = "Hi name my";
		ExamPaper paper = new ExamPaper(correct, question);
		int[] a = { 0, 2, 1 };
		System.out.println(paper.examChecker(a));

	}

}
