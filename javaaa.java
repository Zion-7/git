public class javaaa {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 3.14;
        char letter = 'a';
        boolean isTrue = true;

        int sum = num1 + (int) num2;
        int difference = num1 - (int) num2;
        double product = num1 * num2;
        double quotient = num1 / num2;


        boolean result = (num1 > 5) && (num2 < 4.0);
        boolean notTrue = !isTrue;

        for (int i = 0; i < 5; i++) {
            System.out.println("i is " + i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("j is " + j);
            j++;
        }

        int sumResult = addNumbers(5, 10);
        System.out.println("The sum is " + sumResult);

        Person person = new Person("John", 25);
        person.sayHello();
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is tsion getnet " and I am " + age + " years old.");
}
    }