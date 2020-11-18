package designPatterns.structureType.facadePattern;

/**
 * @program: LifeLongLearning
 * @description 子系统中的接口一实现类
 * @author: mujianwang
 * @create: 2020-11-18 11:13
 **/
public class SubSystemOneImpl implements SubSystemOne {

    @Override
    public void functionOne() {
        System.out.println("子系统接口一的功能");
    }
}
