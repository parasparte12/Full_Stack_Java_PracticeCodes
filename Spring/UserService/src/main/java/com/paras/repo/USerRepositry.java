package com.paras.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paras.entity.User;

public interface USerRepositry  extends JpaRepository<User, Integer> {

}
