package dio.example.model.course;

public record Topic(String title, int length) {

    @Override
    public int length() {
        if (length > 0) {

            return length;
        }
        return 0;
    }

    @Override
    public String toString() {
        return title + " (" + length + " min)";
    }
}
