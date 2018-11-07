package com.InteligentService.SecureCloud;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByName(String Name);


}
