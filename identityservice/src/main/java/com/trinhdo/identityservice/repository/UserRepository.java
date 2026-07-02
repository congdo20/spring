package com.trinhdo.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trinhdo.identityservice.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
