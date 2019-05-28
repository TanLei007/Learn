package com.gl.springbootdesignpatterns.CombinationMode;

/**
 * @description: 人类资源部
 * @author: TL
 * @create: 2019-05-28 19:16
 **/
public class HRDepartment extends Company{

    public HRDepartment(String name){
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < depth; i++) {
            str.append("-");
        }

        str.append(name);

        System.out.println(str.toString());
    }

    @Override
    public void lineOfDuty() {
        System.out.println("员工招聘培训管理" + name);
    }
}
