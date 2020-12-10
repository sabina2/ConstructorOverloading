package com.Loading;

public class EmployeeInfo {
    int id;
    String name;
    int phone_no;
    int salary;

    EmployeeInfo(int a,String  b,int c,int d){
        id=a;
        name=b;
        phone_no=c;
        salary=d;

    }
    EmployeeInfo(int j,String k,int l){
        id=j;
        name=k;
        phone_no=l;

        }
        EmployeeInfo(int a,String b){
        id=a;
        name=b;
        }

    public static void main(String[] args) {
        EmployeeInfo e1=new EmployeeInfo(1,"Ram",123456789,20000);
        EmployeeInfo e2=new EmployeeInfo(2,"Shyam",24567890);
        EmployeeInfo e3=new EmployeeInfo(3,"Hari");
        System.out.println(e1.id+" "+e1.name+" "+e1.phone_no+" "+ e1.salary);
        System.out.println(e2.id+" "+e2.name+" "+e2.phone_no);
        System.out.println(e3.id+" "+e3.name);
    }
}
