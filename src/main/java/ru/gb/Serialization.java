package ru.gb;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {

        Student student = new Student("Naumov", 41, 5);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("student.bin"))){

            objectOutputStream.writeObject(student);
            System.out.println("Сериализация выполнена");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}