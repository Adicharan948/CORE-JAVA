package charan.Student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import charan.Student.Entity.Student;

public interface studentrepo extends JpaRepository<Student, Integer> {

}