//Import Library
import javax.swing.JOptionPane;



public class Ghibli {



// user begins game with 0 points
    static int points = 0;


    // display game name
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the Ghibli Studio Trivia. (DISCLAIMER: Most of these facts are not true :,)");


        // call the quiz method
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        result();
    }







// question 1
    public static void question1() {
        String answer = JOptionPane.showInputDialog("Question 1 of 10:\n" +
                "What year was Studio Ghibli founded? \n" +
                "A. 1956\n" +
                "B. 1985\n" +
                "C. 2000\n" +
                "D. 2004");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)
                    case "B", "b" -> points++;
                    }
                    }







// question 2
    public static void question2() {
        String answer =  JOptionPane.showInputDialog(null, "Question 2 of 10:\n" +
                "How many mangoes are in Jennifer’s kitchen?\n" +
                "A. 52\n" +
                "B. 3\n" +
                "C. 56\n" +
                "D. 0");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)
                    case "C", "c" -> points++;
                    }
                    }







// question 3
    public static void question3() {
        String answer =  JOptionPane.showInputDialog("Question 3 of 10:\n" +
                "How many Jellybeans are in Aretre’s Jar?\n" +
                "A. 342\n" +
                "B. 758\n" +
                "C. 352\n" +
                "D. 122");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)
                    case "D", "d" -> points++;
                    }
                    }





// question 4
    public static void question4() {
        String answer =  JOptionPane.showInputDialog("Question 4 of 10:\n" +
                "What is Amberly’s favorite fruit?\n" +
                "A. Apple\n" +
                "B. Banana\n" +
                "C. Strawberry\n" +
                "D. Mangoes");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)
                    case "C", "c" -> points++;
                    }
                    }







// question 5
    public static void question5() {
        String answer =  JOptionPane.showInputDialog("Question 5 of 10:\n" +
                "What is Amberly’s favorite Sanrio character?\n" +
                "A. Hello Kitty\n" +
                "B. Lazy Egg\n" +
                "C. Kuromi\n" +
                "D. Cinnaminroll");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)
                    case "B", "b" -> points++;
                    }
                    }






// question 6
    public static void question6() {
        String answer =  JOptionPane.showInputDialog("Question 6 of 10:\n" +
                "What is Amberly’s hat color?\n" +
                "A. Yellow\n" +
                "B. Red\n" +
                "C. Black\n" +
                "D. Green");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)

                    case "A", "a" -> points++;
                    }
                    }







// question 7
    public static void question7() {
        String answer = JOptionPane.showInputDialog("Question 7 of 10:\n" +
                "How many apples are in Aretre’s bag?\n" +
                "A. 1\n" +
                "B. 4\n" +
                "C. 0\n" +
                "D. 7");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)
                    case "D", "d" -> points++;
                    }
                    }







// question 8
    public static void question8() {
        String answer = JOptionPane.showInputDialog("Question 8 of 10:\n" +
                "How much money do we have?\n" +
                "A. 15\n" +
                "B. 0\n" +
                "C. 1000000\n" +
                "D. 5");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)
                    case "B", "b" -> points++;
                    }
                    }







// question 9
    public static void question9() {
        String answer = JOptionPane.showInputDialog("Question 9 of 10:\n" +
                "When should Amberly go home?\n" +
                "A. Mon\n" +
                "B. Thurs\n" +
                "C. Tue\n" +
                "D. All of the above");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)
                    case "B", "b" -> points++;
                    }
                    }





// question 10
    public static void question10() {
        String answer = JOptionPane.showInputDialog("Question 10 of 10:\n" +
                "How many questions do you think you got correct?\n" +
                "A. 4\n" +
                "B. 0\n" +
                "C. 8\n" +
                "D. 10/10");
                switch (answer){
                    // user can input lower case or capital of correct letter choice (add 1 point to user score if correct)
                    case "B", "b" -> points++;
                    }
                    }







// print out a statement based on how well the user performed 
    public static void result() {
        // get user input for their name
        String name = JOptionPane.showInputDialog(null,"You finished the quiz.\nPlease enter your name?");
        // :)
        if (points == 10)
        {
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Score: " + points + "\nYou did it! Great Job! :)");
        }else if(points >= 5) {
            // :|
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Score: " + points + "\nYou Passed the quiz. :,) ");
        }else{
            // :(
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nTotal Score: " + points + "\n🙁");
        }
    }




}

