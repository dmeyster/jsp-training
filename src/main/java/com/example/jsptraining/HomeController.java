package com.example.jsptraining;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
    @ModelAttribute("myArray")
    public int[] myArray() {
        return new int[100];
    }

    @GetMapping("/home")
    public String goHome(Model model, @ModelAttribute("myArray") int[] array) {
        MyModel myModel = new MyModel();
        myModel.setArray(array);
        System.out.println("in home controller");
        return "printAll";
    }
    @GetMapping("/search")
    public String goSearch() {
        System.out.println("in home controller");
        return "search";
    }

    @GetMapping("/getElement")
    public String goGetElement() {
        System.out.println("in home controller");
        return "getElement";
    }
}

