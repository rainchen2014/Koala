package cn.com.koala.controller;

import cn.com.koala.bean.Student;
import cn.com.koala.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping(value = "welcome", method = {RequestMethod.GET, RequestMethod.POST})
    public String welcome(ModelMap model, Integer id) {
        Student student = studentService.getById(id);
        model.addAttribute("message", student.getStudentName());
        return "welcome";

    }

    @RequestMapping(value = "save", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String save(Student student) {
        //studentService.save(student);
        return "成功";

    }

}
