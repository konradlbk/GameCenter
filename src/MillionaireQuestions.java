public class MillionaireQuestions {

    String question;
    String ans1;
    String ans2;
    String ans3;
    String ans4;

    public MillionaireQuestions(String question, String ans1, String ans2, String ans3, String ans4) {
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String toFileLine(){
        String SEPARATOR  = Millionaire.SEPARATOR;
        String line = "";
        //kazde pole pochodzace z obiektu zapisujemy w linii oddzielając separatorem
        line+=question + SEPARATOR;
        line += ans1 + SEPARATOR;
        line += ans2 + SEPARATOR;
        line+=ans3+SEPARATOR;
        line += ans4 +SEPARATOR;
        return line;
    }

    @Override
    public String toString() {
        return question  +
                " A: " + ans1  +
                " B: " + ans2  +
                " C: " + ans3  +
                " D: " + ans4  ;
    }
}
