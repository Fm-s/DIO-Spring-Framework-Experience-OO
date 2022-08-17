package dio.example.model;

import static dio.example.util.Calculator.MinutesToString;

public class Mentoring extends Activity {
    private String mentor;
    private String description;

    public Mentoring(String title, int length, String mentor, String description){
        super(title,length);
        this.mentor = mentor;
        this.description = description;
    }

    @Override
    public void detail(String pre) {
        System.out.println(pre + "Mentoria " + super.getTitle());
        System.out.println(pre + " Descrição: " + description);
        System.out.println(pre + " Mentor: " + mentor);
        System.out.println(pre + " Carga Horária: " + MinutesToString(super.getActivityLength()));
    }
}
