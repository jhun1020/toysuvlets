package com.jhuntoylab.toysuvlets;

import java.util.ArrayList;
import java.util.HashMap;

public class DatasInfor {
    // public HashMap<String, String> getSearchSurvey() {
    //     HashMap<String, String> searchSurvey = new HashMap<String, String>();
    //     // 
    //     searchSurvey.put("question", "해당 매장을 방문시 매장은 청결 하였습니까?");
    // searchSurvey.put("questions_uid", "Q1");
    //     searchSurvey.put("order", "1");
        
    //     return searchSurvey;
    // }


    // public HashMap<String, Object> getSurveyBundle(){
    //     DatasInfor datasInfor = new DatasInfor();
    //     ArrayList<SurveyList> surveyArrayList = datasInfor.getSurveyArrayList();

    //     Surveybundles.put("surveyList", datasInfor.getSurveyList());

    //     return Surveybundles;
    // }

    public  ArrayList<String> getSurveyArrayList(){
        ArrayList<String> surveyArrayList = new ArrayList<String>();

        surveyArrayList.add("해당 매장을 방문시 매장은 청결 하였습니까?");
        surveyArrayList.add("주문시 직원은 고객님께 친절 하였습니까?");
        surveyArrayList.add("주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        surveyArrayList.add("직원이 제조한 음료에 대해 맛은 좋았습니까?");
        surveyArrayList.add("해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");


        return surveyArrayList;
    }



}


