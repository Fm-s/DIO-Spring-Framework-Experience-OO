package dio.example.model.course;

import dio.example.model.Activity;

import java.util.ArrayList;
import java.util.List;

import static dio.example.util.Calculator.MinutesToString;

public class Course extends Activity {

    private List<Subject> subjects;

    public Course(String title) {
        super(title);
    }

    @Override
    public void detail(String pre) {
        System.out.println(pre + "Curso  " + super.getTitle());
        System.out.println(pre + "Carga Horária: " + MinutesToString(super.getActivityLength()));
        System.out.println(pre + "Matérias:");
        if (subjects == null || subjects.isEmpty()) System.out.println(" . . .");
        else for (Subject subject : subjects) subject.Detail(pre + "  ");
    }

    public void AddSubject(Subject subject) {
        if (this.subjects == null) {
            this.subjects = new ArrayList<>();
        }
        super.setActivityLength(super.getActivityLength() + subject.getLength());
        this.subjects.add(subject);
    }
}
