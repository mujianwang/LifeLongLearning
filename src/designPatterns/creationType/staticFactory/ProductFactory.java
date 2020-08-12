package designPatterns.creationType.staticFactory;

/**
 * @program: LifeLongLearning
 * @description 产品工厂类
 * @author: mujianwang
 * @create: 2020-08-12 17:29
 **/
public class ProductFactory {

    /**
     * 创建产品, 向上转型为接口
     * 由工厂决定创建那类产品
     *
     * @param productName
     * @return
     */
    public static IProduct createProduct(String productName) {

        if ("A".equals(productName)) {
            return new ProductA();
        } else if ("B".equals(productName)) {
            return new ProductB();
        } else {
            return null;
        }
    }
}
