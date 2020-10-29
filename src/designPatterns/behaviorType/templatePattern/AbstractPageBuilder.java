package designPatterns.behaviorType.templatePattern;

/**
 * @program: LifeLongLearning
 * @description 抽象模板类, HTML页面构造器
 * @author: mujianwang
 * @create: 2020-10-29 16:45
 **/
public abstract class AbstractPageBuilder {

    private static final String DEFAULT_DOCTYPE = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";

    private static final String DEFAULT_XMLNS = "http://www.w3.org/1999/xhtml";

    private StringBuffer stringBuffer = new StringBuffer();

    /**
     * 模板方法，构建某个对象的步骤与顺序(或者定义一个算法的骨架)
     * 父类提供，通常不允许子类重写，故final修饰
     *
     * @return
     */
    public final String buildHtml() {

        stringBuffer.append(DEFAULT_DOCTYPE);
        stringBuffer.append("<html xmlns=\"" + DEFAULT_XMLNS + "\">");
        stringBuffer.append("<head>");
        appendTitle(stringBuffer);
        appendMeta(stringBuffer);
        appendLink(stringBuffer);
        appendScript(stringBuffer);
        stringBuffer.append("</head>");
        appendBody(stringBuffer);
        stringBuffer.append("</html>");
        return stringBuffer.toString();
    }

    /**
     * 抽象方法，子类必须实现
     * 模板方法中必须实现的步骤(通常均为必须实现)
     *
     * @param stringBuffer
     */
    abstract void appendTitle(StringBuffer stringBuffer);

    /**
     * 抽象方法，子类必须实现
     * 模板方法中必须实现的步骤(通常均为必须实现)
     *
     * @param stringBuffer
     */
    abstract void appendBody(StringBuffer stringBuffer);

    /**
     * 默认方法，子类可选择实现
     * 给子类足够的自由度，可以提供一些方法供子类覆盖，去实现一些骨架中不是必须却可以有自定义实现的步骤
     *
     * @param stringBuffer
     */
    void appendMeta(StringBuffer stringBuffer) {
    }

    /**
     * 默认方法，子类可选择实现
     *
     * @param stringBuffer
     */
    void appendLink(StringBuffer stringBuffer) {
    }

    /**
     * 默认方法，子类可选择实现
     *
     * @param stringBuffer
     */
    void appendScript(StringBuffer stringBuffer) {
    }
}
