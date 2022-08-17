package dio.example.model;

import java.util.ArrayList;
import java.util.List;

import static dio.example.util.Calculator.LineBreak;

public class Developer {

    private String name;

    private List<Bootcamp> bootcamps;

    public Developer(String name){
        this.name = name;
    }

    public void SubscribeToBootcamp(Bootcamp bootcamp){
        AddToBootcampList(bootcamp);
        bootcamp.EnrollDeveloper(this);
    }

    private void AddToBootcampList(Bootcamp bootcamp){
        if(this.bootcamps == null){
            this.bootcamps = new ArrayList<>();
        }

        if(!CheckBootcampSubscription(bootcamp)){
            this.bootcamps.add(bootcamp);
        }
    }

    public boolean CheckBootcampSubscription(Bootcamp bootcamp){

        if(this.bootcamps == null) return false;

        return this.bootcamps.contains(bootcamp);
    }

    public void ListBootcamps(){
        System.out.println("Dev - " + this.name + "\nBootcamps:");
        if(bootcamps == null || bootcamps.isEmpty()){
            System.out.println("não está inscrito em nada");
        }else {
            for (Bootcamp bootcamp : bootcamps) System.out.println("- " + bootcamp.getName());
        }
        LineBreak();
    }

    public String getName() {
        return name;
    }
}
