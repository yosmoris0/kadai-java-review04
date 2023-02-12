package jp.co.kiramex.company.entity;

import jp.co.kiramex.company.Programmable;

public class SystemDev extends Division implements Programmable {

    @Override
    public void greeting() {
        System.out.println("システム開発部の皆さんおはようございます");
    }

    @Override
    public void programming() {
        System.out.println("システム開発部の皆さんはプログラミング可能です");
    }

}