package spring.mvc.components;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller


public class StudentController {

        @RequestMapping(value = "/showStudentForm", method = RequestMethod.GET)
    public String showForm(Model model){
        Student student = new Student();

        model.addAttribute("student", student);
            return "student-form";
    }

    @RequestMapping(value = "/processStudentForm", method = RequestMethod.POST)
    public String processStudentForm(@ModelAttribute("student") Student student){
        // log the input data

        System.out.println("theStudent: " + student.getFirstName()
                + " " + student.getLastName());
        return "student-confirmation";

    }

}
