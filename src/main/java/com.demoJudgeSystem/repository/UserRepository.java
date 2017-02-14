package com.demoJudgeSystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.demoJudgeSystem.model.bean.Userend;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<Userend, Long> {

}
