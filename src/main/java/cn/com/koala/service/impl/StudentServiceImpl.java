package cn.com.koala.service.impl;


import cn.com.koala.bean.Student;
import cn.com.koala.dao.StudentDao;
import cn.com.koala.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Resource
    private StudentDao studentDao;

    @Override
    public Student getById(Integer id) {
        return studentDao.getById(id);
    }

    @Override
    public void save(String name, String address) {
        Student student = new Student();
        student.setAddress(address);
        student.setStudentName(name);
        student.setGender(Boolean.TRUE);
        studentDao.save(student);
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }
}
