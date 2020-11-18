package designPatterns.structureType.facadePattern;

/**
 * @program: LifeLongLearning
 * @description 外观接口实现类, 暴露给客户端的功能(方法)可以是子系统中多个功能的组合, 也可以是将子系统中某一个接口的某一功能单独暴露给客户端
 * @author: mujianwang
 * @create: 2020-11-18 11:16
 **/
public class FacadeImpl implements Facade {

    private SubSystemOne subSystemOne;

    private SubSystemTwo subSystemTwo;

    public FacadeImpl() {
        this.subSystemOne = new SubSystemOneImpl();
        this.subSystemTwo = new SubSystemTwoImpl();
    }

    /**
     * 单独使用子系统中的接口一的功能
     */
    @Override
    public void functionOne() {
        subSystemOne.functionOne();
    }

    /**
     * 单独使用子系统中的接口二的功能
     */
    @Override
    public void functionTwo() {
        subSystemTwo.functionTwo();
    }

    /**
     * 组合使用子系统中的接口一和子系统中的接口二的功能
     */
    @Override
    public void functionOneAndTwo() {
        subSystemOne.functionOne();
        subSystemTwo.functionTwo();
    }
}
