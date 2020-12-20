package proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class ImageInvokeHandler implements InvocationHandler {
    private Object mTarget;

    public ImageInvokeHandler(Object target) {
        this.mTarget = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(mTarget, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("on invoke before " + new Date());
    }

    private void after() {
        System.out.println("on invoke after " + new Date());
    }
    
}
