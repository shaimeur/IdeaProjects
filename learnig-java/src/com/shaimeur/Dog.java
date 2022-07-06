package com.shaimeur;

public class Dog {
    String name ;
    int age ;
        public Dog(String name ,int age){
            this.age = age;
            this.name = name;
        }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
