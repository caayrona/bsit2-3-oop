public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rona Caay", 20, "BSIT", 99, 88,75);
        Student student2 = new Student("Inciso Jm", 22, "Crim", 70.5, 75.0, 65.0);
        Student student3 = new Student("Fukiko P", 21, "Pharma", 50.0, 55.0, 60.0);


        Student[] students = {student1, student2, student2};
        int passingCount = 0;

        for (Student student : students) {
            System.out.println("\nStudent Information:");
            student.displayInfo();

            double average = student.calculateAverage();
            System.out.println("Average Grade: " + average);
            System.out.println("Letter Grade: " + student.getLetterGrade());


            if (student.isPassing()) {
                System.out.println("Status: PASSING");
                passingCount++;
            } else {
                System.out.println("Status: FAILING");
            }
        }


        System.out.println("\nTotal number of students passing: " + passingCount);
    }
}
class Student {
    String name;
    int age;
    String course;
    double grade1;
    double grade2;
    double grade3;


    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }


    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }


    public String getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


    public boolean isPassing() {
        return calculateAverage() >= 70;
    }
}


        System.out.println("\nTotal number of students passing: " + passingCount);
    }
}
