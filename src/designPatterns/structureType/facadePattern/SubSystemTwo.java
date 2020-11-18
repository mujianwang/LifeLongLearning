package designPatterns.structureType.facadePattern;

/**
 * @program: LifeLongLearning
 * @description 子系统中的接口二, 根据依赖倒转原则(细节依赖抽象), 底层子系统应该依赖于子系统接口, 但实际使用中此接口为非必须, 当涉及子系统中模块过多时, 会增加项目复杂性, 可由外观类直接包裹子系统类
 * @author: mujianwang
 * @create: 2020-11-18 11:10
 **/
public interface SubSystemTwo {

    void functionTwo();
}
