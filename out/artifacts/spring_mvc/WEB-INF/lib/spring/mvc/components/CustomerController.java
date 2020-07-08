package spring.mvc.components;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;


@Controller
public class CustomerController {

    @RequestMapping("showCustomerForm")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("processCustomerForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer customer,
            BindingResult bindingResult) {
        System.out.println();
        System.out.println(bindingResult);
        if(bindingResult.hasErrors()){
            return "customer-form";
        }else {
//            System.out.println(bindingResult.hasErrors());
//            System.out.print(customer.getFirstName());
//            System.out.println(customer.getLastName());

            return "customer-confirmation";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
}
