package designPatterns.behaviorType.strategyMode;

/**
 * @program: LifeLongLearning
 * @description 上下文类, 含有一个策略接口
 * @author: mujianwang
 * @create: 2020-10-10 17:42
 **/
public class Context {

    //策略接口
    private Strategy strategy;

    public void execute() {
        strategy.algorithm();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
