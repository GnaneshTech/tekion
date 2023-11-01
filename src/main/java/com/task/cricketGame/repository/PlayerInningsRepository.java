package com.task.cricketGame.repository;

import com.task.cricketGame.model.PlayerInnings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerInningsRepository extends JpaRepository<PlayerInnings,Integer> {
}
