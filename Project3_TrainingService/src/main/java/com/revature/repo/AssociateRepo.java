package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.model.Associate;

@Repository
public interface AssociateRepo extends JpaRepository<Associate, Integer> {

}
