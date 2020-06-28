package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.model.Batch;

@Repository
public interface BatchRepo extends JpaRepository<Batch,String> {

}
