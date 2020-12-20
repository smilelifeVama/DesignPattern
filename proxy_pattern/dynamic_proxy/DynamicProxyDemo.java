package proxy_pattern.dynamic_proxy;

import java.lang.reflect.Proxy;

import proxy_pattern.Image;
import proxy_pattern.RealImage;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("Pic0");
        Image imageProxy = (Image) createImageProxy(realImage);
        imageProxy.displayImg();
    }

    public static Object createImageProxy(Object object) {
        Class<?>[] interfaces = object.getClass().getInterfaces();
        ClassLoader classLoader = object.getClass().getClassLoader();
        ImageInvokeHandler invokeHandler = new ImageInvokeHandler(object);
        Object imageProxy = (Image) Proxy.newProxyInstance(classLoader, interfaces, invokeHandler);
        return imageProxy;
    }
}
