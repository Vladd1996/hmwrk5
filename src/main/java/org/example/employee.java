package org.example;

public class employee
{
    String Full_name,position,mail,phone;
    double salary;
    int age;
    employee(String F,String p,String m,String ph,double sal,int ag)
    {
        Full_name=F;
        position=p;
        mail=m;
        phone=ph;
        salary=sal;
        age=ag;
    }
    public void print_employee_info ()
    {
        System.out.println("name:"+Full_name);
        System.out.println("position:"+position);
        System.out.println("email"+mail);
        System.out.println("phone"+phone);
        System.out.println("salary"+salary);
        System.out.println("age"+age);
    }
}
