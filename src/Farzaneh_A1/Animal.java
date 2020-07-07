package Farzaneh_A1;

    abstract class Animal {
        abstract void makeSound();

        public void eat() {
            System.out.println("I can eat.");
            System.out.println("I can play.");
        }
    }

    class Dog extends Animal {

        public void makeSound() {
            System.out.println("Bark bark");
        }
    }




