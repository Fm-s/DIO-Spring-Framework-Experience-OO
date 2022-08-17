package dio.example.model.course;

import java.util.ArrayList;
import java.util.List;

import static dio.example.util.Calculator.MinutesToString;

public class Subject {
    private String title;
    private int length = 0;
    private List<Topic> topics;

    public Subject() {
    }

    public Subject(String title) {
        this.title = title;
    }

    public void Detail(String pre) {
        System.out.println(pre + title + " (" + MinutesToString(length) + ")");
        if (topics == null || topics.isEmpty()) System.out.println(". . .");
        else for (Topic topic : topics) System.out.println(pre + "  " + topic);
    }

    public void AddTopic(Topic topic) {
        if (topics == null) {
            topics = new ArrayList<>();
        }
        this.length += topic.length();
        topics.add(topic);
    }

    public int getLength() {
        return length;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
