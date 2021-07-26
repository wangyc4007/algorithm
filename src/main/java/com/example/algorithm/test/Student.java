package com.example.algorithm.test;

import java.rmi.server.ServerNotActiveException;

/**
 * @author Y~chao
 * @create 2021/7/20 15:05
 */
@MyAnnotation("hello")
public class Student extends Person implements MyInterface,Runnable{

    private int sno;
    double heighf;
    protected double weight;
    public double score;

    @Override
    @MyAnnotation(value = "hello Mymathod")
    public void myMethod() throws NullPointerException{
        System.out.println("重写了父类方法");
    }

    //方法
    @MyAnnotation(value = "himethod")
    public String showInfo(){
        return "我是一名三好学生";
    }
    public String showInfo(int a, int b){
        return "重载方法---我是一名三好学生";
    }
    private void work(int a ){
        System.out.println("我以后会找工作-成为码农 程序员 程序猿 程序媛");
    }
    void happy(){
        System.out.println("做人最重要的是开心每一天");
    }
    protected int getSon(){
        return sno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public double getHeighf() {
        return heighf;
    }

    public void setHeighf(double heighf) {
        this.heighf = heighf;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(){
        System.out.println("空参构造器");
    }
    private Student(int sno){
        this.sno = sno;
    }
    Student(int sno, double weight){
        this.sno = sno;
        this.weight = weight;
    }
    protected Student(int sno,double heighf, double weight){
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", heighf=" + heighf +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }

    @Override
    public void run() {

    }
}
