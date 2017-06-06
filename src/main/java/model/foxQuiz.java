package model;

/**
 * Created by Balázs on 2017. 06. 06..
 */
public class foxQuiz {
  String questions;
  String answers;

  public foxQuiz() {
    }

  public foxQuiz(String questions, String answers) {
    this.questions = questions;
    this.answers = answers;
  }

  public String getQuestions() {
    return questions;
  }

  public void setQuestions(String questions) {
    this.questions = questions;
  }

  public String getAnswers() {
    return answers;
  }

  public void setAnswers(String answers) {
    this.answers = answers;
  }
}
