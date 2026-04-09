interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
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
        Result r = new Result();

        System.out.println("Average: 75.0 -> " + r.getDivision(75.0));
        System.out.println("Average: 60.0 -> " + r.getDivision(60.0));
        System.out.println("Average: 50.0 -> " + r.getDivision(50.0));
        System.out.println("Average: 35.0 -> " + r.getDivision(35.0));
        System.out.println("Average: 25.0 -> " + r.getDivision(25.0));
    }
}