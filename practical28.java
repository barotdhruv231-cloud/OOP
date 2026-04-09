interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    @Override
    public boolean isPassed(int mark) {
        return mark >= 35;
    }

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 45) {
            return "Second Division";
        } else if (average >= 33) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Result result = new Result();

        System.out.println("===== Pass/Fail Check =====");
        int[] marks = {75, 35, 28, 90, 10};
        for (int mark : marks) {
            System.out.println("Mark: " + mark + " -> " + (result.isPassed(mark) ? "Passed" : "Failed"));
        }

        System.out.println("\n===== Division Check =====");
        double[] averages = {75.0, 60.0, 50.0, 35.0, 25.0};
        for (double avg : averages) {
            System.out.println("Average: " + avg + " -> " + result.getDivision(avg));
        }

        System.out.println("\n===== Combined Result =====");
        int studentMark = 55;
        double studentAverage = 62.5;
        System.out.println("Mark: " + studentMark + ", Average: " + studentAverage);
        System.out.println("Status: " + (result.isPassed(studentMark) ? "Passed" : "Failed"));
        System.out.println("Division: " + result.getDivision(studentAverage));

        System.out.println("\n===== Interface Reference Demo =====");
        Exam examRef = new Result();
        Classify classifyRef = new Result();
        System.out.println("Via Exam ref    - Mark 40 isPassed: " + examRef.isPassed(40));
        System.out.println("Via Classify ref - Average 55.0 getDivision: " + classifyRef.getDivision(55.0));
    }
}