package designPatterns.behaviorType.strategyMode;

/**
 * @program: LifeLongLearning
 * @description 策略模式客户端
 * @author: mujianwang
 * @create: 2020-10-10 17:47
 **/
public class StrategyModeClient {

    public static void main(String[] args) {

        //真实业务中, 应该根据具体的场景动态选择(业务判断逻辑)要执行的策略, 此处直接调用三种策略只作为演示
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.execute();

        context.setStrategy(new ConcreteStrategyB());
        context.execute();

        context.setStrategy(new ConcreteStrategyC());
        context.execute();
    }
}
