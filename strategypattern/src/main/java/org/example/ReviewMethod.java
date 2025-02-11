package org.example;

public class ReviewMethod implements IVocabularyMethod{
    @Override
    public void learn(String lesson_id) {
        System.out.println("Review method : "+lesson_id);
    }
}
