package com.example.ComplaintBackend.Controller;

import com.example.ComplaintBackend.Dao.ComplaintDao;
import com.example.ComplaintBackend.Model.Complaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ComplaintController {
    @Autowired
    private ComplaintDao cdao;

    @GetMapping("/")
    public  String home(){
        return "home";
    }
    @PostMapping(path="/reg",consumes="application/json",produces = "application/json")
    public String reg(@RequestBody Complaint c){
        cdao.save(c);
        return  "reg";

    }
}
