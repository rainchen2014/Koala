package cn.com.koala.dao;

import cn.com.koala.bean.Student;

public interface StudentDao {
    public Student getById(Integer id);

    public void save(Student student);
}
