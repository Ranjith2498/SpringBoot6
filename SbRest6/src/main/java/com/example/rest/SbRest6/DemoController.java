package com.example.rest.SbRest6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController

public class DemoController {
	
	@GetMapping("/get")
	public List<Student> something()
	{
		List<Student> al = new ArrayList<>();
		al.add(new Student("Ranjith","Kumar"));
		al.add(new Student("Rakesh","Singh"));
		al.add(new Student("Rajath","Verma"));
		al.add(new Student("Tejas","Jain"));	
		return al;
	}
	
	@GetMapping("/gets")
	public String something1()
	{
		System.out.println("Records are saved");
		return "Records ars saved";
	}
}
