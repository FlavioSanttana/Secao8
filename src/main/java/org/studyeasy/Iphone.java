package org.studyeasy;

public class Iphone extends Tela implements Phone {

    @Override
    public void tamanho() {
        System.out.println("1060 cm");
    }

    @Override
    public void largura() {
        System.out.println("290 cm");
    }

    @Override
    public String processador (){
        return "A15";
    }

    @Override
    public int spaceInGb(){
        return 1024;
    }

}
