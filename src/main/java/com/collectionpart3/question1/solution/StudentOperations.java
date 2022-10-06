package com.collectionpart3.question1.solution;
import com.collectionpart3.question1.model.Student;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentOperations {
    private List<Student> studentList;

    public StudentOperations(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getsortedListByName(){
//        List<Student> sortedListByName = new ArrayList<>();
//        for (Student student : studentList ) {
//            sortedListByName.add(student.getName());
//        }
//        Collections.sort(sortedListByName);
        List<Student> sortedListByName = studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        return sortedListByName;
    }
    public List<Student> getSortedListById(){
        List<Student> sortedListById = studentList.stream()
                .sorted(Comparator.comparing(Student::getId).reversed())
                .collect(Collectors.toList());

        return sortedListById;
    }

    public List<Student> getFilteredList(){
        List<Student> filteredList = studentList.stream()
                .filter(student -> student.getId() > 23)
                .collect(Collectors.toList());

        return filteredList;
    }

    public List<Student> getStudentNameListByLength(){
        List<Student> studentNameList = studentList.stream()
                .filter(student -> student.getName().length() >5 )
                .collect(Collectors.toList());
        return studentNameList;
    }

    public Map<Integer,Student> getStudentMap(){
        Map<Integer, Student> studentMap = studentList.stream()
                .collect(Collectors.toMap(Student::getId, student -> student, (oldValue, newValue) -> oldValue));
        return studentMap;
    }
}
