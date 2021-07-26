package com.example.algorithm.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Y~chao
 * @create 2021/7/20 15:10
 *
 * 反射联系~~~
 */
public class Test {

    @org.junit.Test
    public void test06() throws Exception {



    }
    @org.junit.Test
    public void test05() throws Exception {

        String str = "com.example.algorithm.test.Student";
        Class cls = Class.forName(str);
        System.out.println("------------------");
        Class[] interfaces = cls.getInterfaces();
        for(Class c:interfaces){
            System.out.println(c);
        }

        System.out.println("------------------");
        Class superclass = cls.getSuperclass();
        Class[] interfaces1 = superclass.getInterfaces();
        for(Class c:interfaces1){
            System.out.println(c);
        }
        System.out.println("------------------");
        Package aPackage = cls.getPackage();
        System.out.println(aPackage);
        System.out.println(aPackage.getName());

    }
    @org.junit.Test
    public void test04() throws Exception {

        String str = "com.example.algorithm.test.Student";
        Class cls = Class.forName(str);
        System.out.println("------------------");
        Method[] methods = cls.getMethods();
        for(Method m:methods){
            System.out.println(m);
        }
        System.out.println("------------------");
        Method[] declaredMethods = cls.getDeclaredMethods();
        for(Method m:declaredMethods){
            System.out.println(m);
        }
        System.out.println("------------------");
        Method method = cls.getMethod("showInfo");
        System.out.println(method);
        Method method1 = cls.getMethod("showInfo",int.class, int.class);
        System.out.println(method1);
        System.out.println("------------------");
        Method[] declaredMethods1 = cls.getDeclaredMethods();
        for(Method m:declaredMethods1){
            System.out.println(m);
        }
        System.out.println("------------------");
        Method work = cls.getDeclaredMethod("work",int.class);
        System.out.println(work);
        System.out.println("------------------");
        System.out.println(work.getName());
        System.out.println(Modifier.toString(work.getModifiers()));
        System.out.println(work.getReturnType());
        Class<?>[] parameterTypes = work.getParameterTypes();
        for(Class c:parameterTypes){
            System.out.println(c);
        }
        System.out.println("------------------");
        Method myMethod = cls.getMethod("myMethod");
        System.out.println(myMethod);
        Annotation[] annotations = myMethod.getAnnotations();
        for(Annotation a:annotations){
            System.out.println(a);
        }
        Annotation[] declaredAnnotations = myMethod.getDeclaredAnnotations();
        for(Annotation a:declaredAnnotations){
            System.out.println(a);
        }
        System.out.println("------------------");

        myMethod.invoke(cls.newInstance());
        System.out.println(method1.invoke(cls.newInstance(), 99, 99));

    }
    @org.junit.Test
    public void test03() throws Exception {

        String str = "com.example.algorithm.test.Student";
        Class str1 = Class.forName(str);
        System.out.println("------------------");
        Field[] fields = str1.getFields();
        for(Field f :fields){
            System.out.println(f);
        }
        System.out.println("------------------");
        Field field = str1.getField("score");
        System.out.println(field);
        System.out.println("------------------");
        Field[] declaredFields = str1.getDeclaredFields();
        for (Field f:declaredFields){
            System.out.println(f);
        }
        System.out.println("------------------");
        Field sno = str1.getDeclaredField("sno");
        System.out.println(sno);
        System.out.println("------------------");
        String name = sno.getName();
        System.out.println(name);
        Class<?> type = sno.getType();
        System.out.println(type);
        System.out.println(type.getName());
        System.out.println(Modifier.toString(sno.getModifiers()));
        System.out.println("------------------");
        Field score1 = str1.getField("score");
        Object obj = str1.newInstance();
        score1.set(obj, 99);
        System.out.println(score1);
        System.out.println(obj);


    }
    @org.junit.Test
    public void test02() throws Exception {

        String str = "com.example.algorithm.test.Student";
        Class str1 = Class.forName(str);
        Constructor[] constructors = str1.getConstructors();
        for(Constructor c:constructors){
            System.out.println(c);
        }
        System.out.println("------------------");
        Constructor[] constructors1 = str1.getDeclaredConstructors();
        for(Constructor c:constructors1){
            System.out.println(c);
        }
        System.out.println("------------------");
        Field[] fields = str1.getFields();
        for(Field f:fields){
            System.out.println(f);
        }
        System.out.println("------------------");
        Field[] field = str1.getDeclaredFields();
        for(Field f:field){
            System.out.println(f);
        }
        System.out.println("------------------");
        Object o = str1.newInstance();
        System.out.println(o);
        System.out.println("------------------");
        Constructor constructor = str1.getConstructor();
        System.out.println(constructor);
        System.out.println("------------------");
        Object o1 = constructor.newInstance();
        System.out.println(o1);

    }
    @org.junit.Test
    public void test01() throws Exception {
        //获取Person字节码信息的4种方式
        //方式一
        Person person = new Person();
        Class c1 = person.getClass();
        System.out.println(c1);
        //方式二
        Class<Person> c2 = Person.class;
        System.out.println(c2);
        System.out.println(c1==c2);
        //方式三
        Class c3 = Class.forName("com.example.algorithm.test.Person");
        System.out.println(c3);
        System.out.println(c1==c2&&c2==c3);
        //方式四
        ClassLoader loader = Test.class.getClassLoader();
        Class c4 = loader.loadClass("com.example.algorithm.test.Person");
        System.out.println(c1==c2&&c2==c3&&c3==c4);

    }
}
