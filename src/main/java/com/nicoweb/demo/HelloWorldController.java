package com.nicoweb.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// controler handling http
@RestController
public class HelloWorldController {
    //get method
    // URI
    // method - Hell
    @GetMapping(path="/hello-world")
    public String helloWorld() {
      return "Hello World";
    }
    //bean
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean  helloWorldBean() {
      return new HelloWorldBean("HelloWorld");
    }

    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean  helloWorldBeanVar(@PathVariable String name)  {
      return new HelloWorldBean(String.format("HelloWorld, %s", name));
    }
}
