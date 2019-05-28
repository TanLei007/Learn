package com.gl.springbootdesignpatterns.CombinationMode;

import sun.applet.Main;

/**
 * @description: 组合模式的主调用
 * @author: TL
 * @create: 2019-05-28 19:20
 **/
public class CombinationModeMain {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京分公司");
        root.add(new HRDepartment("总公司人类资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人类资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务部"));
        comp.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HRDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财务部"));
        comp.add(comp2);

        root.display(1);
        root.lineOfDuty();
    }
}
