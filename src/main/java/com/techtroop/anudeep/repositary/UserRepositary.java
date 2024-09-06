package com.techtroop.anudeep.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtroop.anudeep.model.User;

public interface UserRepositary extends JpaRepository<User, Integer>{

}
