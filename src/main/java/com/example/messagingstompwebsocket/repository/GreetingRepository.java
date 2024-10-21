package com.example.messagingstompwebsocket.repository;

import com.example.messagingstompwebsocket.domain.Greeting;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepositoryImplementation<Greeting, Long> {
}