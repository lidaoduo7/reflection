/**
 * Java核心技术卷一page201
 * 副类在PrivateTest.java文件中
 */
package com.liduo.reflection;

import java.lang.reflect.Field;


/**
 * @author liduo
 *当生成一个PrivateTest的实例对象后，可以将他的私有属性name的值改了，
 *通过反射（常为面试题，常见的框架也是在这个原理基础上拓展的,）
 */
public class ReflectionTest {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PrivateTest pt=new PrivateTest();
		
		Class<?> clazz=PrivateTest.class;
		
		Field  field= clazz.getDeclaredField("name");
		
		//压制Java的访问控制检查
		field.setAccessible(true);
		
		System.out.println(field.get(pt));
		
		field.set(pt, "world");
		System.out.println(pt.getName());
	}

}
