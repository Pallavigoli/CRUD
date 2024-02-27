package com.example.sp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AController {

	@GetMapping("createSt")
	public String createSt() {
		return "create";
	}
	@GetMapping("readSt")
	public String readSt() {
		return "read";
	}
	@GetMapping("updateSt")
	public String updateSt() {
		return "update";
	}
	@GetMapping("deleteSt")
	public String deleteSt() {
		return "delete";
	}
}
