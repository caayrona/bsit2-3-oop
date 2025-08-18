public class Main {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();

        String studentName = "John Smith";
        double[] grades = {85.5, 92.0, 78.5, 90.0};

        double average = calculator.calculateAverage(grades);


        String letterGrade = calculator.getLetterGrade(average);

        calculator.displayResult(studentName, average);
        System.out.println();
        calculator.displayResult(studentName, average, letterGrade);
    }
}

