package designPatterns.structureType.facadePattern;

/**
 * @program: LifeLongLearning
 * @description 外观模式客户端
 * @author: mujianwang
 * @create: 2020-11-18 13:34
 **/
public class FacadePatternDemo {

    public static void main(String[] args) {

        //=============外观模式===============
        System.out.println("=============外观模式===============");
        Facade facade = new FacadeImpl();
        System.out.println("-------------子系统功能一---------------");
        facade.functionOne();
        System.out.println("-------------子系统功能二---------------");
        facade.functionTwo();
        System.out.println("-------------子系统功能一和二组合---------------");
        facade.functionOneAndTwo();

        //=============原始方式===============
        System.out.println("=============原始方式===============");
        SubSystemOne subSystemOne = new SubSystemOneImpl();
        SubSystemTwo subSystemTwo = new SubSystemTwoImpl();
        System.out.println("-------------子系统功能一---------------");
        subSystemOne.functionOne();
        System.out.println("-------------子系统功能二---------------");
        subSystemTwo.functionTwo();
        System.out.println("-------------子系统功能一和二组合---------------");
        subSystemOne.functionOne();
        subSystemTwo.functionTwo();

    }
}
