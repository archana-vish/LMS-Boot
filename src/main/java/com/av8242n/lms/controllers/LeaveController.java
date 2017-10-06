package com.av8242n.lms.controllers;


import com.av8242n.lms.model.Leave;
import com.av8242n.lms.model.User;
import com.av8242n.lms.service.LeaveService;
import com.av8242n.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeaveController {

    @Autowired
    LeaveService leaveService;

    @GetMapping("/leave/all")
    public List<Leave> getAllLeave() {
        return leaveService.getAllLeave();
    }

    @GetMapping("/leave/{userid}")
    public List<Leave> getLeave(@PathVariable("userid") int userid) {
        return leaveService.getLeave(userid);
    }
}
