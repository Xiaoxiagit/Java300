package com.example.testdemo;

public class Dog {
        private String name;
        private String age;
        public Dog() {
        }
        public Dog(String name, String age) {
            this.name = name;
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(String age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public String getAge() {
            return age;
        }
}
