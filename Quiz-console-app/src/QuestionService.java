public class QuestionService {
    Questions[] ques = new Questions[5];
    QuestionService(){

     ques[0] = new Questions(
             1,
             "What is the size of int in Java?",
             new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on OS"},
             "4 bytes"
     );

     ques[1] = new Questions(
             2,
             "Which keyword is used to inherit a class in Java?",
             new String[]{"implements", "extends", "inherits", "super"},
             "extends"
     );

     ques[2] = new Questions(
             3,
             "Which method is the entry point of a Java program?",
             new String[]{"start()", "main()", "run()", "init()"},
             "main()"
     );

     ques[3] = new Questions(
             4,
             "Which concept allows one object to take many forms?",
             new String[]{"Encapsulation", "Abstraction", "Polymorphism", "Inheritance"},
             "Polymorphism"
     );

     ques[4] = new Questions(
             5,
             "Which exception is unchecked in Java?",
             new String[]{"IOException", "SQLException", "NullPointerException", "FileNotFoundException"},
             "NullPointerException"
     );


 }

    public Questions[] getQuestionsList(){
        return ques;
    }

}


