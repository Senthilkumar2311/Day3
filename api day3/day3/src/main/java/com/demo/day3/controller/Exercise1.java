package com.demo.day3.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {
@Value("1")
public int id;
@Value("senthil")
public String name;
@Value("20")
public int age;
@Value("200000")
public long salary;
@RequestMapping("/day")
public String day() {
	return id+"-"+name+"-"+age+"-"+salary;
}
}
