package designPatterns.behaviorType.observerMode.novelSubscriptionExample;

/**
 * @program: LifeLongLearning
 * @description 小说订阅示例客户端
 * @author: mujianwang
 * @create: 2020-09-29 15:48
 **/
public class NovelSubscriptionExampleClient {

    public static void main(String[] args) {

        //四个读者, 两个作者
        Reader r1 = new Reader("读者1");
        Reader r2 = new Reader("读者2");
        Reader r3 = new Reader("读者3");
        Reader r4 = new Reader("读者4");
        Writer w1 = new Writer("作者1");
        Writer w2 = new Writer("作者2");
        //四人关注作者1, 两人关注作者2
        r1.subscribe("作者1");
        r2.subscribe("作者1");
        r3.subscribe("作者1");
        r4.subscribe("作者1");
        r3.subscribe("作者2");
        r4.subscribe("作者2");

        //作者1发布新书
        w1.addNovel("设计模式");
        //作者2发布新书
        w2.addNovel("JAVA编程思想");
        //读者1取消关注作者1
        r1.unSubscribe("作者1");
        //作者1发布新书将不会通知读者1
        w1.addNovel("深入理解JAVA虚拟机");
    }
}
