package com.av8242n.lms.repositories;

import com.av8242n.lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
}
