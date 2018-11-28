package com.study.designpattern._15composite;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-20 14:37
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("上海总公司");
        root.add(new HRDepartment("总公司HR"));
        root.add(new FinanceDepartment("总公司财务"));
        ConcreteCompany company1 = new ConcreteCompany("华中分公司");
        company1.add(new HRDepartment("华中HR"));
        company1.add(new FinanceDepartment("华中财务"));
        ConcreteCompany company2 = new ConcreteCompany("南京办事处");
        company2.add(new HRDepartment("南京办事处HR"));
        company2.add(new FinanceDepartment("南京办事处财务"));
        root.add(company1);
        company1.add(company2);
        root.display(1);
        root.onDuty();
        System.out.println("-----------------------------------");
        company1.display(1);
        company1.onDuty();
    }
}
