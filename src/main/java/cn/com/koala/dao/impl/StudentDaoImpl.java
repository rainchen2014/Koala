package cn.com.koala.dao.impl;

import cn.com.koala.bean.Student;
import cn.com.koala.dao.StudentDao;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class StudentDaoImpl implements StudentDao{
    @Resource
    private HibernateTemplate hibernateTemplate;

    @Override
    public Student getById(Integer id) {
        return hibernateTemplate.get(Student.class, id);
    }

    @Override
    public void save(Student student) {
        hibernateTemplate.save(student);
    }
}
