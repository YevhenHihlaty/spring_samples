package spring.mvc.components;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping("form")
    public String showForm() {
        return "mainForm";
    }

    @RequestMapping("processForm")
    public String processForm(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName").toUpperCase();
        name = "Yo! " + name;
        model.addAttribute("message", name);
        return "processedForm";
    }

    @RequestMapping("processFormV2")
    public String processFormV2(@RequestParam ("studentName") String studentName,
                                Model model) {
        model.addAttribute("message", "It`s version 2, Yo! " + studentName.toUpperCase() + " DUDE");
        return "processedForm";
    }

}
