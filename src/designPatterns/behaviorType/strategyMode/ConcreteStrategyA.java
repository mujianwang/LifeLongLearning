package designPatterns.behaviorType.strategyMode;

/**
 * @program: LifeLongLearning
 * @description 具体策略A
 * @author: mujianwang
 * @create: 2020-10-10 17:37
 **/
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("采用策略A计算");
    }
}
