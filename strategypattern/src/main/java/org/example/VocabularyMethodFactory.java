package org.example;

import java.util.HashMap;

public class VocabularyMethodFactory {
    private static HashMap<String,IVocabularyMethod> map;

    static {
        /**
         *  to inject manually dependencies because I don't implement spring to maven.
         */

        map = new HashMap<>();
        ReviewMethod reviewMethod = new ReviewMethod();
        SpacedRepetitionMethod spacedRepetitionMethod = new SpacedRepetitionMethod();

        map.put(VocabularyMethod.getId(ReviewMethod.class),reviewMethod);
        map.put(VocabularyMethod.getId(SpacedRepetitionMethod.class),spacedRepetitionMethod);
    }

    /**
     * find method by methodId and learn
     * @param lessonId
     * @param methodId
     */
    public void learn(String lessonId,String methodId){
        IVocabularyMethod method = map.get(methodId);
        if (method == null){
            System.out.println("Invalid methodId !");
            return;
        }

        method.learn(lessonId);
    }

}
