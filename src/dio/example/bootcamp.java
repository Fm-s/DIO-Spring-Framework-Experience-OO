package dio.example;

import dio.example.model.Bootcamp;
import dio.example.model.Developer;
import dio.example.model.Mentoring;
import dio.example.model.course.Course;
import dio.example.model.course.Subject;
import dio.example.model.course.Topic;

public class bootcamp {
    public static void main(String[] args) {
        Bootcamp javaSpring = new Bootcamp("Java Spring Experience","Bootcamp Springboot Java na DIO");

        Course firstCourse = new Course("Java POO");

        Subject firstSubject = new Subject("Estrutura Basica OO");
        firstSubject.AddTopic(new Topic("1 - Classes",15));
        firstSubject.AddTopic(new Topic("2 - Atributos", 5));
        firstSubject.AddTopic(new Topic("3 - Métodos", 10));

        Subject secondSubject = new Subject("Estrutura Java");
        secondSubject.AddTopic(new Topic("1 - Diferenças entre Programação estruturada e OO",20));
        secondSubject.AddTopic(new Topic("2 - Funções utilitárias e conceitos basicos",20));

        firstCourse.AddSubject(firstSubject);
        firstCourse.AddSubject(secondSubject);

        Mentoring firstMentoring = new Mentoring("Docker e Containers",120,"Denilson","Introdução ao Docker e Containers");

        javaSpring.AddActivity(firstCourse);
        javaSpring.AddActivity(firstMentoring);


        Bootcamp linuxExp = new Bootcamp("Linux Experience","Bootcamp Linux Experince na DIO");

        Course secondCourse = new Course("Sistemas Linux");

        Subject thirdSubject = new Subject("Linux Bash");
        thirdSubject.AddTopic(new Topic("1 - Comandos Basicos",10));
        thirdSubject.AddTopic(new Topic("2 - Comandos Avançados",20));

        Subject fourthSubject = new Subject("Gnome GCI");
        fourthSubject.AddTopic(new Topic("1 - Diposições Gerais", 5));
        fourthSubject.AddTopic(new Topic("2 - Configurações Especificas", 8));

        secondCourse.AddSubject(thirdSubject);
        secondCourse.AddSubject(fourthSubject);

        Mentoring secondMentoring = new Mentoring("Introdução ao Ubuntu",120,"John Doe","Introdução aos recuros do Ubuntu");

        linuxExp.AddActivity(secondCourse);
        linuxExp.AddActivity(firstMentoring);
        linuxExp.AddActivity(secondMentoring);


        Developer devOne = new Developer("João");
        Developer devTwo = new Developer("Maria");
        Developer devThree = new Developer("Felipe");

        devOne.SubscribeToBootcamp(linuxExp);
        javaSpring.EnrollDeveloper(devTwo);

        devThree.SubscribeToBootcamp(javaSpring);
        linuxExp.EnrollDeveloper(devThree);

        javaSpring.BootcampDetail();
        linuxExp.BootcampDetail();

        javaSpring.ListDevelopers();
        linuxExp.ListDevelopers();

        devOne.ListBootcamps();
        devTwo.ListBootcamps();
        devThree.ListBootcamps();

    }
}
