package dio.example.util;

public abstract class Calculator {
    public static String MinutesToString(int minutes){
        int rest = minutes%60;
        int hours = (minutes - rest)/60;
        if (hours > 0){
            return hours + "h e " + rest + " minutos";
        }
        return minutes + " minutos";
    }

    public static void LineBreak(){
        System.out.println("\n");
    }
}
