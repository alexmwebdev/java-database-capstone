package com.project.back_end.controllers;

//import java.util.Map;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.back_end.models.Admin;
@RestController // 1. Mark as REST controller
@RequestMapping("${api.path}admin") // Base URL: /api/admin if api.path=/api/
public class AdminController {

}