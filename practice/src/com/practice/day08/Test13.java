package com.practice.day08;

public class Test13 {
    public static void main(String[] args) {
        final int EMPLOYEE = 10;//表示普通员工
        final int PROGRAMMER = 11;//表示程序员
        final int DESIGNER = 12;//表示设计师
        final int ARCHITECT = 13;//表示架构师

        String[][] EMPLOYEES = {
                {"10", "1", "段誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭靖", "25", "7100"},
                {"12", "12", "黄蓉", "27", "9600", "4800"}
        };

        Employee[] all = new Employee[EMPLOYEES.length];
        for (int i = 0; i < all.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            if(type == EMPLOYEE){
                all[i] = new Employee(id, name, age, salary);
            }else if(type == PROGRAMMER){
                all[i] = new Programmer();
            }else if(type == DESIGNER){
                double bonus = Integer.parseInt(EMPLOYEES[i][5]);
                all[i] = new Designer(id, name, age, salary, bonus);
            }else if(type == ARCHITECT){
                double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                int stock = Integer.parseInt(EMPLOYEES[i][6]);
                all[i] = new Architect(id, name, age, bonus, stock);
            }
        }

        System.out.println("编号\t姓名\t年龄\t薪资\t语言\t奖金\t股票");
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].getInfo());
        }
    }

}

//员工
class Employee{
    private int id;
    private String name;
    private int age;
    private double money;

    public Employee() {
    }

    public Employee(int number, String name, int age, double money) {
        this.id = number;
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public int getNumber() {
        return id;
    }

    public void setNumber(int number) {
        this.id = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public String getInfo(){
        System.out.println(id+" "+name+" "+age+" "+money);
        return getInfo();
    }
}
//程序员
class Programmer extends Employee{
    private String yuyan = "Java语言";

    public Programmer() {
        super();
    }
    public Programmer(int number, String name, int age, double money, String yuyan) {
        super(number, name, age, money);
        this.yuyan = yuyan;
    }

    public String getYuyan() {
        return yuyan;
    }

    public void setYuyan(String yuyan) {
        this.yuyan = yuyan;
    }
    public String getInfo(){
        return getInfo()+"  "+yuyan;
    }
}
//设计师
class Designer extends Employee{
    private double jiangji;

    public Designer() {
    }

    public Designer(double jiangji) {
        this.jiangji = jiangji;
    }

    public Designer(int number, String name, int age, double money, double jiangji) {
        super(number, name, age, money);
        this.jiangji = jiangji;
    }

    public double getJiangji() {
        return jiangji;
    }

    public void setJiangji(double jiangji) {
        this.jiangji = jiangji;
    }
    public String getInfo(){
        return getInfo()+"  "+jiangji;
    }
}
//架构师
class Architect extends Employee{
    private int gupiao;

    public Architect() {
    }

    public Architect(int gupiao) {
        this.gupiao = gupiao;
    }

    public Architect(int number, String name, int age, double money, int gupiao) {
        super(number, name, age, money);
        this.gupiao = gupiao;
    }
    public String getInfo(){
        return getInfo()+"  "+gupiao;
    }
}