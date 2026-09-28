public class Decision {

    private String question;
    private String optionA;
    private String optionB;

    public Decision(String question, String optionA, String optionB) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
    }

    public String getQuestion() {
        return question;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }
}