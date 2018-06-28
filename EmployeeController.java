package com.tfapp.tfapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView employee() {
        return new ModelAndView("employee", "command", new Employee());
    }

    /* @PostMapping("/addemployee")
     public String addEmployee(@ModelAttribute Employee employee) {
         return "result";
    }
 */
    public String addEmployee(@ModelAttribute("SpringWeb") Employee employee,
                              ModelMap model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("tfactor", employee.gettfactor());
        model.addAttribute("id", employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.gettfactor());
        System.out.println(employee.getName());

        return "result";
    }
}