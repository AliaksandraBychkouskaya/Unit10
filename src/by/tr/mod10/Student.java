package by.tr.mod10;

import java.util.Date;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private Date date;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    public Student (int _id, String _name, String _surname, String _middleName, Date _date, String _address, int _phoneNumber, String _faculty, int _course){
        id = _id;
        name = _name;
        surname = _surname;
        middleName = _middleName;
        date = _date;
        address = _address;
        phoneNumber = _phoneNumber;
        faculty = _faculty;
        course = _course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                phoneNumber == student.phoneNumber &&
                course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(middleName, student.middleName) &&
                Objects.equals(date, student.date) &&
                Objects.equals(address, student.address) &&
                Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, middleName, date, address, phoneNumber, faculty, course);
    }
}
