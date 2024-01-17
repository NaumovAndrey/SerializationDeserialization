package ru.gb;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {

        Student student;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("student.bin"))){

            student = (Student) objectInputStream.readObject();
            System.out.println(student); //значение GPA не было сохранено/восстановлено по причине маркера на поле GPA класса Student? который помечен как временный, поэтому это поле не сериализовано.

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
