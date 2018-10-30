package com.zd.learn.springboot.controller;

import com.zd.learn.springboot.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ThymeleafController {

    @RequestMapping(value = "/index")
    public String index(ModelMap model) {

        Person person1 = Person.builder().name("zhangsan").age(13).build();

        Person person2 = Person.builder().name("lisi").age(12).build();
        Person person3 = Person.builder().name("wangwu").age(10).build();
        Person person4 = Person.builder().name("zhaoliu").age(11).build();


        List<Person> personList = Arrays.asList(person1, person2, person3, person4);

        model.addAttribute("persons", personList);
        model.addAttribute("person", person1);

        return "index";
    }
}
