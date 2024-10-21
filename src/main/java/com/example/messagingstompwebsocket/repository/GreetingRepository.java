package com.example.messagingstompwebsocket.repository;

import com.example.messagingstompwebsocket.domain.Greeting;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepositoryImplementation<Greeting, Long> {

    // Вызов хранимой процедуры add_greeting с параметром
    @Query(value = "SELECT * FROM add_greeting(:greetingContent)", nativeQuery = true)
    Greeting addGreeting(@Param("greetingContent") String greetingContent);
}