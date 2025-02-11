package org.example;

public class Main {
    public static void main(String[] args) {
        String lessonId = "1234";
        VocabularyMethodFactory vocabularyMethodFactory = new VocabularyMethodFactory();
        vocabularyMethodFactory.learn(lessonId,"Method1");
        System.out.println("=====================================================");
        vocabularyMethodFactory.learn(lessonId,"Method2");
        System.out.println("=====================================================");
        vocabularyMethodFactory.learn(lessonId,"Method3");
    }
}