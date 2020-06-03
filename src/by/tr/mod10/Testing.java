package by.tr.mod10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testing {
    public static void main(String[] args) throws ParseException {
        Customer c1 = new Customer(111, "Aleks", "Peshko","Pavlovna","Minsk",123,123);
        Customer c2 = new Customer(111, "Aleks", "Peshko","Pavlovna","Minsk",123,123);
        Customer c3 = new Customer(112, "Artsiom", "Peshko","Iosifovich","Minsk",123,123);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        Student s1 = new Student(222,
                "Varvara",
                "Sheverha",
                "Dmitrievna",
                new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2008"),
                "Minsk", 1234567,"Veterinary",1);
        Student s2 = new Student(222,
                "Varvara",
                "Sheverha",
                "Dmitrievna",
                new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2008"),
                "Minsk", 1234567,"Veterinary",1);
        Student s3 = new Student(222,
                "Varvara",
                "Sheverha",
                "Dmitrievna",
                new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2008"),
                "Vitebsk", 1234567,"Veterinary",1);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());



    }
}
