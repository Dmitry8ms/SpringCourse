package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author Neil Alishev
 */
@Controller
@RequestMapping("/first")
public class FirstController {
    private final static Map<String, BiFunction<Integer, Integer, Double>> calc = new HashMap<>();
    {
        calc.put("addition", (x, y) -> (double) (x + y));
        calc.put("subtraction", (x, y) -> (double) (x - y));
        calc.put("multiplication", (x, y) -> (double) (x * y));
        calc.put("division", (x, y) -> (double) x / (double) y);
    }
    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam (value = "name", required = false) String name
            , @RequestParam (value = "name", required = false) String surname) {
        System.out.println("Good bye, " + name + " " + surname);
        return "first/goodbye";
    }

    @GetMapping("/calc")
    public  String calculator(HttpServletRequest request, Model model) {
        int x = Integer.parseInt(request.getParameter("x"));
        int y = Integer.parseInt(request.getParameter("y"));
        String action = request.getParameter("action");
        model.addAttribute("action", FirstController.calc.get(action).apply(x, y));
        return "first/calc";
    }

}
