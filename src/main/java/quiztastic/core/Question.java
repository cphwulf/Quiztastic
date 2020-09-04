package quiztastic.core;

/**
 * The Question Class.
 *
 * Should contain information about the questions
 */
public class Question {
    String category;
    int  value;
    String question;
    String answer;

    public Question(String category, int value, String question, String answer) {
        this.category = category;
        this.value = value;
        this.question = question;
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public int getValue() {
        return value;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "category='" + category + '\'' +
                ", value=" + value +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
