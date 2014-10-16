/**
 * Java核心技术卷一page201
 * 主类在ReflectionTest.java
 */
package com.liduo.reflection;

/**
 * @author liduo
 *当生成一个PrivateTest的实例对象后，可以将他的私有属性name的值改了，
 *通过反射（常为面试题，常见的框架也是在这个原理基础上拓展的）
 */
public class PrivateTest {
	
	private String name="hello";
	
	public String getName()
	{
		return this.name;
	}
}
