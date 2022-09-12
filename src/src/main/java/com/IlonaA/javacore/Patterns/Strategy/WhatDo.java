package src.main.java.com.IlonaA.javacore.Patterns.Strategy;

import src.main.java.com.IlonaA.javacore.Patterns.Strategy.ForStrategy.StrategyI;

abstract class WhatDo {
    StrategyI strategyI;

    public WhatDo(StrategyI strategyI) {
        this.strategyI = strategyI;
    }
  void  singer(){
        strategyI.sing();
    }
    abstract void perform();
    abstract void biss();
}
