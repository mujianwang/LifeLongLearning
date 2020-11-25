package designPatterns.structureType.proxyPattern.dynamicProxy;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: LifeLongLearning
 * @description 生成动态代理产生的代理类字节码文件到本地
 * @author: mujianwang
 * @create: 2020-11-25 15:43
 **/
public class DynamicProxyClassFileOutputTool {

    public static void main(String[] args) throws IOException {

        byte[] classFile = ProxyGenerator.generateProxyClass("TestProxy", new Class[]{Image.class});
        File file = new File("D:/tempProxy/TestProxy.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(classFile);
        fos.flush();
        fos.close();
    }
}
