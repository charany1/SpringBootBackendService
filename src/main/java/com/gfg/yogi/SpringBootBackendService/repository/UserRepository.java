package com.gfg.yogi.SpringBootBackendService.repository;

import com.gfg.yogi.SpringBootBackendService.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
