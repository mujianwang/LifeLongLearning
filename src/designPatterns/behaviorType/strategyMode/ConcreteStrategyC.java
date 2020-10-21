package designPatterns.behaviorType.strategyMode;

/**
 * @program: LifeLongLearning
 * @description 具体策略C
 * @author: mujianwang
 * @create: 2020-10-10 17:39
 **/
public class ConcreteStrategyC implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("采用策略C计算");
    }
}
