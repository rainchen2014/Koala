package cn.com.koala.service;

import cn.com.koala.bean.Student;


public interface StudentService {
    public Student getById(Integer id);

    public void save(String name, String address);

    public void save(Student student);
}
