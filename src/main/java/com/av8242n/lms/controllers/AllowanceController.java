package com.av8242n.lms.controllers;

import com.av8242n.lms.model.Allowance;
import com.av8242n.lms.service.AllowanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/allowance/")
public class AllowanceController {

    @Autowired
    AllowanceService allowanceService;

    @GetMapping("/all")
    public List<Allowance> getAllowances() {
        return allowanceService.getAllowances();
    }

    @GetMapping("/{userid}")
    public List<Allowance> getUserAllowance(@PathVariable("userid") int id){
        return allowanceService.findByUserId(id);
    }

    @PostMapping("/add")
    public Allowance addUserAllowance(@RequestBody Allowance allowance) {
        return allowanceService.addAllowance(allowance);
    }

    @PutMapping("/edit")
    public Allowance editUserAllowance(@RequestBody Allowance allowance) {
        return allowanceService.editAllowance(allowance);
    }

    @DeleteMapping("/{userid}")
    public List<Allowance> deleteAllowance(@PathVariable("userid") int id) {
        return allowanceService.deleteAllowance(id);
    }
}
