package designPatterns.behaviorType.iteratorPattern;

/**
 * @program: LifeLongLearning
 * @description 迭代器模式Demo
 * @author: mujianwang
 * @create: 2021-04-10 15:44
 **/
public class IteratorPatternDemo {

    public static void main(String[] args) {

        ConcreteContainer container = new ConcreteContainer();

        for (Iterator iterator = container.getIterator(); iterator.hasNext(); ) {
            System.out.println((String) iterator.next());
        }
    }
}
