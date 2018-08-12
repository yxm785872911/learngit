package com.yxm.offer;

import com.yxm.test.Outer.Inner;

public class Offer02Singleton {
	
	
	
}
//饿汉式在类加载的时候就新建了一个singleton对象，降低了内存的使用效率。
//懒汉式
class Singleton{
	//私有化构造函数
	private Singleton(){
		
	}
	//定义静态成员变量
	public static Singleton singleton = null;
	public static Singleton getInstance(){
		if (singleton==null) {	//我们只是在实例还没有创建出来的时候需要加锁。
			synchronized (Singleton.class) {
				if (singleton==null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}

/**
 * 静态内部类实现单例模式，既不用加锁，又可以延迟加载
 * @author DELL
 *
 */
class Singleton2{
	//私有化构造函数
	private Singleton2(){
	}
	//定义静态内部类
	private static class Inner{
		//在内部类之中定义静态外部类对象
		private static Singleton2 singleton = new Singleton2();
	}
	//只有执行方法的时候才会初始化内部类
	public static Singleton2 getInstance(){
		return Inner.singleton;
	}
}