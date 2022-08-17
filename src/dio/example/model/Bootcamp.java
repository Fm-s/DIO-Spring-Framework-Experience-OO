package dio.example.model;

import java.util.ArrayList;
import java.util.List;

import static dio.example.util.Calculator.LineBreak;
import static dio.example.util.Calculator.MinutesToString;

public class Bootcamp {

    public Bootcamp(){}

    public Bootcamp(String name, String description){
        this.name = name;
        this.description = description;
    }

    private String name;
    private String description;
    private int bootcampLength;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private List<Activity> activities;

    private List<Developer> enrolledDevelopers;

    public void EnrollDeveloper(Developer developer){
        if(developer.CheckBootcampSubscription(this)){
            AddDeveloperToList(developer);
        }else{
            developer.SubscribeToBootcamp(this);
        }
    }

    private void AddDeveloperToList(Developer developer){
        if(this.enrolledDevelopers == null){
            this.enrolledDevelopers = new ArrayList<>();
        }

        if(!this.enrolledDevelopers.contains(developer)){
            this.enrolledDevelopers.add(developer);
        }
    }

    public void AddActivity(Activity activity){
        if(this.activities == null) {
            this.activities = new ArrayList<>();
        }
        if(!activities.contains(activity)){
            this.activities.add(activity);
            UpdateActivityLength(activity.getActivityLength());
        }
    }

    private void UpdateActivityLength(int minutes){
        this.bootcampLength += minutes;
    }

    public void ListDevelopers(){
        if(enrolledDevelopers == null || enrolledDevelopers.isEmpty()){
            System.out.println("não há inscritos");
        }else {
            System.out.println("Bootcamp - " + this.name + "\nLista de Inscritos:");
            for (Developer dev : enrolledDevelopers) System.out.println("- " + dev.getName());
        }
        LineBreak();
    }

    public void BootcampDetail(){
        System.out.println("Bootcamp: " + name + "\nDescrição: " + description + "\nCarga Horária: " + MinutesToString(bootcampLength));
        System.out.println("Atividades:");
        if(activities == null || activities.isEmpty()) System.out.println(". . .");
        else for (Activity activity : activities) {
            activity.detail("   ");
            System.out.println();
        }
        LineBreak();
    }

    public String getName() {
        return name;
    }
}
