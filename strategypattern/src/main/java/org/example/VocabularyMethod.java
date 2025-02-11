package org.example;

public enum VocabularyMethod {
    REVIEW_METHOD("Method1",ReviewMethod.class),
    SPACED_REPETITION_METHOD("Method2", SpacedRepetitionMethod.class),
    ;

    private String id;
    private Class<? extends IVocabularyMethod> method;

    private VocabularyMethod(String id,Class<? extends IVocabularyMethod> method) {
        this.id = id;
        this.method = method;
    }



    public static Class getMethod(String methodId){
        for (VocabularyMethod vocabularyMethod : VocabularyMethod.values()){
            if (vocabularyMethod.id.equals(methodId)){
                return vocabularyMethod.method;
            }
        }

        throw new RuntimeException("Invalid method !");
    }

    public static String getId(Class method){
        for (VocabularyMethod vocabularyMethod : VocabularyMethod.values()){
            if (vocabularyMethod.method == method){
                return vocabularyMethod.id;
            }
        }

        throw new RuntimeException("Invalid method !");
    }

}
