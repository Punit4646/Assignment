public class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String errorMessage) {
        super(errorMessage);
    }
}

public class NameNotValidException extends Exception {
    public NameNotValidException(String errorMessage) {
        super(errorMessage);
    }
}

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;

        // Check if name contains numbers or special symbols
        if (!name.matches("^[a-zA-Z]*$")) {
            throw new NameNotValidException("Name should only contain alphabets");
        }
        this.name = name;

        // Check if age is within range
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        this.age = age;

        this.course = course;
    }

    // Getters and setters for the class attributes
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameNotValidException {
        // Check if name contains numbers or special symbols
        if (!name.matches("^[a-zA-Z]*$")) {
            throw new NameNotValidException("Name should only contain alphabets");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeNotWithinRangeException {
        // Check if age is within range
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
