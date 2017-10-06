package com.av8242n.lms.service;

import com.av8242n.lms.model.Leave;
import com.av8242n.lms.repositories.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    LeaveRepository leaveRepository;

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

        return Arrays.asList(new Leave[]{ new Leave(1,1, LocalDate.of(2017,06,1),
                LocalDate.of(2017,6,15),
                1, 6, 2,1,
                LocalDate.of(2017,6,16),
                LocalDate.of(2017, 6, 16),
                LocalDate.of(2017, 6, 16),
                2)});

        //Arrays.asList(new String[] {"a"});
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
