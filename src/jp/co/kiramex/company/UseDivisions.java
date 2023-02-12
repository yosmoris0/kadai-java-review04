package jp.co.kiramex.company;

import jp.co.kiramex.company.entity.General;
import jp.co.kiramex.company.entity.SystemDev;

public class UseDivisions {

    public static void main(String[] args) {

        General emp01 = new General();
        SystemDev emp02 = new SystemDev();

        emp01.greeting();
        emp02.greeting();
    }

}