public class Questions {
    int id;
    String question;
    String[] opt;

    String answer;

    Questions(int id , String question , String[] opt , String answer){
        this.id = id;
        this.question = question;
        this.opt = opt;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setOpt(String[] opt) {
        this.opt = opt;
    }

    public String[] getOpt() {
     return opt;
    }

    public String getAnswer() {
        return answer;
    }
}
