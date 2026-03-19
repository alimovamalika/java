// Переименовали базовый класс, чтобы не было конфликтов с другими заданиями
class CourseTask13 {
    String courseName;

    CourseTask13(String courseName) {
        this.courseName = courseName;
    }

    void startCourse() {
        System.out.println(courseName + " course is starting.");
    }
}

class ProgrammingCourse extends CourseTask13 {
    ProgrammingCourse(String courseName) {
        super(courseName);
    }

    @Override
    void startCourse() {
        System.out.println(courseName + " course: Learning to code!");
    }
}

class MathCourse extends CourseTask13 {
    MathCourse(String courseName) {
        super(courseName);
    }

    @Override
    void startCourse() {
        System.out.println(courseName + " course: Solving equations and problems!");
    }
}

class HistoryCourse extends CourseTask13 {
    HistoryCourse(String courseName) {
        super(courseName);
    }

    @Override
    void startCourse() {
        System.out.println(courseName + " course: Exploring historical events!");
    }
}

public class Task13Main {
    public static void main(String[] args) {
        CourseTask13 programming = new ProgrammingCourse("Programming");
        CourseTask13 math = new MathCourse("Mathematics");
        CourseTask13 history = new HistoryCourse("History");

        programming.startCourse();
        math.startCourse();
        history.startCourse();
    }
}