package com.learning.examples.dynamicproxies;

import java.lang.reflect.Proxy;
import java.util.Map;

public class ProxyExample {
  public static void main(String[] args) {
    Map mapProxy =
        (Map)
            Proxy.newProxyInstance(
                ProxyExample.class.getClassLoader(),
                new Class[] {Map.class},
                new DynamicInvocationHandler());
    mapProxy.put(1, "A");
    mapProxy.put(2, "B");
    System.out.println(mapProxy);
    System.out.println(mapProxy instanceof Map);
  }
}