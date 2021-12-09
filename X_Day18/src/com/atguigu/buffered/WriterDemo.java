package com.atguigu.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class WriterDemo implements Serializable {
    private static final long serialVersionUID = 3984473034401084179L;

    public static void main(String[] args) throws IOException {
        //学生对象的信息写入到文件
        Student stu1 = new Student("guigu001","郭富城","22","北京");
        Student stu2 = new Student("guigu002","刘德华","32","香港");
        Student stu3 = new Student("guigu003","周润发","42","香港");
        Student stu4 = new Student("guigu004","张学友","30","武汉");
        //id,姓名,年龄,居住地
        //先把学生对象存到集合中
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,stu1,stu2,stu3,stu4);
        //创建bw对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("X_Day18/test/学生.txt"));

        //遍历集合 取出几个元素 并获得元素属性做拼接,拼完,写入文件中
        for (Student student : list) {
            String age = student.getAge();
            String assress = student.getAssress();
            String id = student.getId();
            String name = student.getName();
            StringBuilder sb = new StringBuilder(id);
            sb.append(",").append(name).append(",").append(age).append(",").append(assress);
            bw.write(sb +"");
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
