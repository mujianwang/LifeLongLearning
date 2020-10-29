package designPatterns.behaviorType.templatePattern;

/**
 * @program: LifeLongLearning
 * @description 模板方法模式客户端
 * @author: mujianwang
 * @create: 2020-10-29 19:38
 **/
public class TemplatePatternDemo {

    public static void main(String[] args) {

        MyPageBuilder pageBuilder = new MyPageBuilder();
        System.out.println(pageBuilder.buildHtml());
    }
}
