package org.studyeasy;

public class SamsungPhone implements Phone {

    @Override
    public String processador (){
        return "1000";
    }

    @Override
    public int spaceInGb(){
        return 564;
    }
}
