package com.practice.day11;
/*
- 模拟接待员接待用户，根据用户id，给用户分组。
- 定义用户类：
  - 属性：用户类型，用户id
  - 提供基本的构造方法和get方法，set方法
- 定义接口Filter：
  - 提供抽象方法filterUser（User u）
- 定义实现类V1Filter，实现抽象方法，将用户设置为v1
- 定义实现类V2Filter，实现抽象方法，将用户设置为v2
- 定义实现类AFilter，实现抽象方法，将用户设置为A
- 定义接待员类Receptionist：
  - 属性：接口Filter
  - 提供基本的构造方法和get方法，set方法
  - 成员方法：接待用户方法，设置用户类型。
- 测试类：
  - 初始化15个User对象，id为1-15。
  - 创建三个接待员对象。
    - 第一个接待员，设置接待规则，将1-5号用户类型设置为v1。
    - 第二个接待员，设置接待规则，将6-10号用户类型设置为v2。
    - 第三个接待员，设置接待规则，将11-15号用户类型设置为A。
  - 遍历数组，给用户分区。
 */
public class Test5 {
    public static void main(String[] args) {
        User[] all = new User[15];
        for (int i = 0; i < all.length; i++) {
            all[i] = new User(null,i+1);
        }
        V1Filter V1F = new V1Filter();
        V2Filter V2F = new V2Filter();
        AFilter aF = new AFilter();
        Receptionist r1 = new Receptionist(V1F);
        for (int i = 0; i < 5; i++) {
            r1.recept(all[i]);
        }
        Receptionist r2 = new Receptionist(V2F);
        for (int i = 5; i < 10; i++) {
            r2.recept(all[i]);
        }
        Receptionist r3 = new Receptionist(aF);
        for (int i = 10; i < 15; i++) {
            r3.recept(all[i]);
        }
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}
class User{
    private String type;//用户
    private int id;

    public User(String type, int id) {
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "-" + type;
    }
}
interface Filter{
    public void filterUser(User u);
}
class V1Filter implements Filter{

    @Override
    public void filterUser(User u) {
        u.setType("V1");
    }
}
class V2Filter implements Filter{

    @Override
    public void filterUser(User u) {
        u.setType("V2");
    }
}
class AFilter implements Filter{

    @Override
    public void filterUser(User u) {
        u.setType("A");
    }
}
class Receptionist{
    private Filter filter;

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    public void recept(User u){
        if(u.getType() != null){
            return;
        }
        filter.filterUser(u);
    }
}