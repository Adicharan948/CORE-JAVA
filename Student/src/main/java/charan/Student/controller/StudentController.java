package charan.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import charan.Student.Entity.Student;
import charan.Student.Repo.studentrepo;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private studentrepo studentrepo;


    // 1. CREATE STUDENT
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentrepo.save(student);
    }


    // 2. GET ALL STUDENTS
    @GetMapping
    public List<Student> getAllStudents() {
        return studentrepo.findAll();
    }


    // 3. GET STUDENT BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentrepo.findById(id).orElse(null);
    }


    // 4. UPDATE STUDENT
    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable Integer id,
            @RequestBody Student student) {

        Student existingStudent = studentrepo.findById(id).orElse(null);

        if (existingStudent != null) {

            existingStudent.setName(student.getName());
            existingStudent.setPhone(student.getPhone());
            existingStudent.setDepartment(student.getDepartment());
            existingStudent.setCourse(student.getCourse());
            existingStudent.setCgpa(student.getCgpa());

            return studentrepo.save(existingStudent);
        }

        return null;
    }


    // 5. DELETE STUDENT
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {

        if (studentrepo.existsById(id)) {

            studentrepo.deleteById(id);

            return "Student deleted successfully";
        }

        return "Student not found";
    }
}