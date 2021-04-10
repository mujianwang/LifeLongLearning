package designPatterns.behaviorType.iteratorPattern;

/**
 * @program: LifeLongLearning
 * @description 具体聚合，实现聚合接口，创建所需的具体迭代器
 * @author: mujianwang
 * @create: 2021-04-10 15:27
 **/
public class ConcreteContainer implements Container {

    String[] elementData = {"data1", "data2", "data3", "data4", "data5", "data6",};

    /**
     * 对外方法，返回一个迭代器
     *
     * @return
     */
    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }

    /**
     * 内部类，具体迭代器实现
     */
    private class ConcreteIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < elementData.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return elementData[index++];
            }
            return null;
        }
    }
}
