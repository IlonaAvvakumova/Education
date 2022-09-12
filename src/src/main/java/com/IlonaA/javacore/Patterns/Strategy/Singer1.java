package src.main.java.com.IlonaA.javacore.Patterns.Strategy;

import src.main.java.com.IlonaA.javacore.Patterns.Strategy.ForStrategy.StrategyI;

public class Singer1 extends WhatDo{
    public Singer1(StrategyI strategyI) {
        super(strategyI);
    }

    @Override
    void perform() {
        System.out.println("Делает поклон");
    }

    @Override
    void biss() {
        System.out.println("Выходит на бисс");
    }
}
