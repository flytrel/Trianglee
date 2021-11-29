package com.company;

public class Triangle { //объявляем класс треугольников
    double side_1; // объявляем переменную, которая будет равна стороне треугольника
    double side_2;
    double side_3;

    public Triangle(double side_1, double side_2, double side_3) { //создаем функцию конструктор
        this.side_1 = side_1; // приравниваем аргументы функции к объявленным переменным класса
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    public Triangle() {}; //создаем функцию конструктор без аргументов




}