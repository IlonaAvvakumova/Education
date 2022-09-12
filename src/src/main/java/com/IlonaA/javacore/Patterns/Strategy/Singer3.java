package src.main.java.com.IlonaA.javacore.Patterns.Strategy;

import src.main.java.com.IlonaA.javacore.Patterns.Strategy.ForStrategy.StrategyI;

public class Singer3 extends WhatDo{
    public Singer3(StrategyI strategyI) {
        super(strategyI);
    }

    @Override
    void perform() {
        System.out.println("Выбегает");
    }

    @Override
    void biss() {
        System.out.println("Убегает");
    }
}
