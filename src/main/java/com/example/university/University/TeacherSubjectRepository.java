package com.example.university.University;

import com.example.university.Teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TeacherSubjectRepository extends JpaRepository<TeacherSubjects,Long> {
 // public   Optional<TeacherSubjects>findBySubject_IdAndAndTeacherId(long subjectId,long teacherId);
    List<TeacherSubjects>findAllByTeacherId(long id);

}
