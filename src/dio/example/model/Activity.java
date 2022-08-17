package dio.example.model;

public abstract class Activity {

    private String title;
    private int ActivityLength;


    public Activity(String title, int length){
        this.title = title;
        this.ActivityLength = length;
    }

    public Activity(String title){
        this.title = title;
    }

    public int getActivityLength() {
        if(ActivityLength > 0){
            return ActivityLength;
        }
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public abstract void detail(String pre);

    protected void setActivityLength(int activityLength) {
        ActivityLength = activityLength;
    }
}
