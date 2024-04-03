package com.micro.user.service.UserService.repository;

import com.micro.user.service.UserService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
}
