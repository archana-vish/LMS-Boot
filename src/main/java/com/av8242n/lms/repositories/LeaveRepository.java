package com.av8242n.lms.repositories;

import com.av8242n.lms.model.Leave;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface LeaveRepository extends CrudRepository<Leave, Serializable> {
}
