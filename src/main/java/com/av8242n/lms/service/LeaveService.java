package com.av8242n.lms.service;


import com.av8242n.lms.model.Leave;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LeaveService {

    List<Leave> getAllLeave();
    List<Leave> getLeave(int userid);
    Leave getLeaveDetail(int userid, int leaveid);
    Leave updateLeave(Leave leave);
    Leave createLeave(Leave leave);
    Leave deleteLeave(int userid, int leaveid);


}
