package com.av8242n.lms.service;

import com.av8242n.lms.model.Allowance;
import com.av8242n.lms.model.Unit;
import com.av8242n.lms.repositories.AllowanceRepository;
import com.av8242n.lms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AllowanceServiceImpl implements  AllowanceService {

    @Autowired
    AllowanceRepository allowanceRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Allowance> getAllowances() {
        List<Allowance> allowances = new ArrayList<>();
//        return allowanceRepository.getAllAllowance();
        Iterator<Allowance> iterator = allowanceRepository.findAll().iterator();
        while (iterator.hasNext()) {
            allowances.add(iterator.next());
        }
        return  allowances;
    }

    @Override
    public Allowance findByUserId(int id) {
        return allowanceRepository.findAllowanceByUser(userRepository.findOne(id));
    }

    @Override
    public Allowance getAllowance(int id) {
        return allowanceRepository.findOne(id);
    }

    @Override
    public Allowance addAllowance(Allowance allowance) {
        return allowanceRepository.save(allowance);
    }

    @Override
    public Allowance editAllowance(Allowance allowance) {
        return allowanceRepository.save(allowance);
    }

    @Override
    public List<Allowance> deleteAllowance(int id) {
        return null;
    }


}
