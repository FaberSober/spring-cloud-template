package com.faber.nacos.spring.boot.dao;

import com.faber.nacos.spring.boot.modal.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
