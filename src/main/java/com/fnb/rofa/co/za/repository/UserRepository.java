package com.fnb.rofa.co.za.repository;

import com.fnb.rofa.co.za.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
