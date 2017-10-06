package com.av8242n.lms.service;

import com.av8242n.lms.model.Leave;
import com.av8242n.lms.repositories.LeaveRepository;
import com.av8242n.lms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    LeaveRepository leaveRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Leave> getAllLeave() {
        List<Leave> leaves = new ArrayList<>();
        Iterator<Leave> iterator = leaveRepository.findAll().iterator();
        while (iterator.hasNext()) {
            leaves.add(iterator.next());
        }
        return leaves;
    }

    @Override
    public List<Leave> getLeave(int userid) {
        return leaveRepository.findLeavesByUser(userRepository.findOne(userid));
    }

    @Override
    public Leave getLeaveDetail(int userid, int leaveid) {
        return null;
    }

    @Override
    public Leave updateLeave(Leave leave) {
        return null;
    }

    @Override
    public Leave createLeave(Leave leave) {
        return null;
    }

    @Override
    public Leave deleteLeave(int userid, int leaveid) {
        return null;
    }
}
