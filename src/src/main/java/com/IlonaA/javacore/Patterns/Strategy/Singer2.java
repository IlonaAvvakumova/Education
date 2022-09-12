package src.main.java.com.IlonaA.javacore.Patterns.Strategy;

import src.main.java.com.IlonaA.javacore.Patterns.Strategy.ForStrategy.StrategyI;

public class Singer2 extends WhatDo{
    public Singer2(StrategyI strategyI) {
        super(strategyI);
    }

    @Override
    void perform() {
        System.out.println("Смотрит в пол");
    }

    @Override
    void biss() {
        System.out.println("Стесняется");
    }
}
