package com.av8242n.lms.repositories;

import com.av8242n.lms.model.Leave;
import com.av8242n.lms.model.User;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface LeaveRepository extends CrudRepository<Leave, Serializable> {
    List<Leave> findLeavesByUser(User user);

}
