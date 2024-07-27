package com.learning.examples;

import com.learning.model.PaymentMessage;

import java.io.*;
import java.time.Instant;

import static java.lang.System.out;

public class SerializationExample {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    PaymentMessage PaymentMessage = new PaymentMessage(1, "test", Instant.now());
    out.println(PaymentMessage);
    FileOutputStream fileOutputStream =
        new FileOutputStream("C:\\Users\\sardurai\\Downloads\\TestingSerialization.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(PaymentMessage);
    FileInputStream fileInputStreamputStream =
        new FileInputStream("C:\\Users\\sardurai\\Downloads\\TestingSerialization.txt");
    ObjectInputStream ObjectInputputStream = new ObjectInputStream(fileInputStreamputStream);
    PaymentMessage dese = (PaymentMessage) ObjectInputputStream.readObject();
    out.println(dese);
  }
}
