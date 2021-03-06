import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class inject {
	private int questionid;
	private String question;
	
	private List<String> answers;
	private Set<String> answerSet;
	private Map<Integer,String> answersMap;
	
	
	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public Set<String> getAnswerSet() {
		return answerSet;
	}

	public void setAnswerSet(Set<String> answerSet) {
		this.answerSet = answerSet;
	}

	public Map<Integer, String> getAnswersMap() {
		return answersMap;
	}

	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}

	public void displaylist() {
		System.out.println(questionid+"."+question);
		for(String ans : answers) {
			System.out.println(ans);
		}
	}
	
	public void displayset() {
		System.out.println(questionid+"."+question);
		for(String ans : answerSet) {
			System.out.println(ans);
		}
	}
	
	public void displaymap() {
		System.out.println(questionid+"."+question);
		Set set = answersMap.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry m1= (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"."+m1.getValue());
		}
	}
	
	
	
}

