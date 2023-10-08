package org.example;
// . Написать иерархию классов «Фигуры».
//Фигура -> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и
//подсчет периметра. Создать массив из 5 фигур. Вывести на экран
//сумму периметра всех фигур в массиве.

public abstract class Figure {
    abstract double Area();
    abstract double Perimeter();

    abstract class Rectangle extends Figure {
        double a, b; // стороны прямоугольника

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        double Area() {
            return a*b;
        }

        double Perimeter() {
            return 2*(a+b);
        }
    }
        abstract class Triangle extends Figure {
            double a, b, c; //стороны треугольника

            public Triangle(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            double Area() {
                // проверка, вообще ли из расстояний a, b, c можно образовать треугольник
                if (((a + b) < c) || ((b + c) < a) || ((a + c) < b))
                    return 0;
                double pl = (a + b + c) / 2; // полупериметр
                double s;
                // Формула Герона
                s = Math.sqrt(pl * (pl - a) * (pl - b) * (pl - c));
                return s;
            }

            double Perimeter() {
                double p = a + b + c;
                return p;
            }
        }
            abstract class Circle extends Figure {
                double r;
                public Circle(double r) {
                    this.r = r;
                }
                double Area() {
                    return (Math.PI)*r*r;
                }

                double Perimeter() {
                    return 2*(Math.PI)*r;

                }
            }
        }






