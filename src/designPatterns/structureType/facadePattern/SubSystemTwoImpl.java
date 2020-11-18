package designPatterns.structureType.facadePattern;

/**
 * @program: LifeLongLearning
 * @description 子系统中的接口二实现类
 * @author: mujianwang
 * @create: 2020-11-18 11:14
 **/
public class SubSystemTwoImpl implements SubSystemTwo {

    @Override
    public void functionTwo() {
        System.out.println("子系统接口二的功能");
    }
}
