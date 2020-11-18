package designPatterns.structureType.facadePattern;

/**
 * @program: LifeLongLearning
 * @description 外观接口, 根据依赖倒转原则(细节依赖抽象), 应有外观具体类实现此接口, 但实际使用中此接口为非必须, 此方式会增加项目复杂性, 可由外观类直接包裹子系统类
 * @author: mujianwang
 * @create: 2020-11-18 11:16
 **/
public interface Facade {

    void functionOne();

    void functionTwo();

    void functionOneAndTwo();
}
