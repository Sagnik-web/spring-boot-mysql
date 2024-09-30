package com.mysql.Blog.Repo;

import com.mysql.Blog.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
