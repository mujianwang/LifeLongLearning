package designPatterns.behaviorType.templatePattern;

/**
 * @program: LifeLongLearning
 * @description 模板子类，自定义HTML构造器
 * @author: mujianwang
 * @create: 2020-10-29 19:32
 **/
public class MyPageBuilder extends AbstractPageBuilder {

    @Override
    void appendTitle(StringBuffer stringBuffer) {
        stringBuffer.append("<title>你好</title>");
    }

    @Override
    void appendBody(StringBuffer stringBuffer) {
        stringBuffer.append("<body>你好，世界！</body>");
    }

    @Override
    void appendMeta(StringBuffer stringBuffer) {
        stringBuffer.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>");
    }
}
