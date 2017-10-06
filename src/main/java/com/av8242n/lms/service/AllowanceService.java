package com.av8242n.lms.service;

import com.av8242n.lms.model.Allowance;

import java.util.List;

public interface AllowanceService {

    List<Allowance> getAllowances();
    Allowance getAllowance(int id);
    Allowance addAllowance(Allowance allowance);
    Allowance editAllowance(Allowance allowance);
    List<Allowance> deleteAllowance(int id);
    Allowance findByUserId(int id);

}
