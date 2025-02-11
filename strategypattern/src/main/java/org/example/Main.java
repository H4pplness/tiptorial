package org.example;

public class Main {
    public static void main(String[] args) {
        String lessonId = "1234";
        VocabularyMethodFactory vocabularyMethodFactory = new VocabularyMethodFactory();
        vocabularyMethodFactory.learn(lessonId,"Method1"); // review method
        System.out.println("=====================================================");
        vocabularyMethodFactory.learn(lessonId,"Method2"); // spaced repetition method
        System.out.println("=====================================================");
        vocabularyMethodFactory.learn(lessonId,"Method3");
    }
}