package com.gl.springbootdesignpatterns.CombinationMode;





import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体公司类
 * @author: TL
 * @create: 2019-05-24 09:22
 **/
public class ConcreteCompany extends Company{

    private List<Company> children = new ArrayList<>(10);

    public ConcreteCompany(String name){
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < depth; i++) {
            str.append("-");
        }

        str.append(name);

        System.out.println(str.toString());

        for (Company child : children) {
            child.display(depth + 2);
        }
    }

    /**
     * 流行职责
     */
    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
