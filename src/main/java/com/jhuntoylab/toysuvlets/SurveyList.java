package com.jhuntoylab.toysuvlets;

// 쉬운거부터 하고 list와 bundle은 주말동안 시도해보자 


public class SurveyList {
    String question;
    String questions_uid;
    String order;

    public void setQuestion(String question){
        this.question = question;
    }
    public String getQuestion(){
        return question;
    }

    public void setQuestions_uid(String questions_uid){
        this.questions_uid = questions_uid;
    }
    public String getQuestions_uid(){
        return questions_uid;
    }

    public void setOrder(String order){
        this.order = order;
    }
    public String getOrder(){
        return order;
}

}