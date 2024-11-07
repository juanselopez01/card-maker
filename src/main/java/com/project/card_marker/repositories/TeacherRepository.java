package com.project.card_marker.repositories;

import com.project.card_marker.models.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher,Integer>{
}
