package com.av8242n.lms.repositories;

import com.av8242n.lms.model.Allowance;
import com.av8242n.lms.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface AllowanceRepository extends CrudRepository<Allowance, Integer> {

    String Q_GET_ALL_ALLOWANCE = "select a from Allowance a left join a.unit";

    @Query(Q_GET_ALL_ALLOWANCE)
    List<Allowance> getAllAllowance();

    Allowance findAllowanceByUser(User user);


}
