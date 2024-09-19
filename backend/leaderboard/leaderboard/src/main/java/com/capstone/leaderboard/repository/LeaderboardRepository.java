package com.capstone.leaderboard.repository;

import com.capstone.leaderboard.model.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderboardRepository extends JpaRepository<Leaderboard, Long> {
    //implement custom qries
}