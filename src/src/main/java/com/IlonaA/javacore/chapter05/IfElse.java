package src.main.java.com.IlonaA.javacore.chapter05;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if(month==12 || month==1 || month==2)
            season = "zime";
        else if (month==3 || month==4 || month==5)
            season = "vesne";
        else if (month==6 || month==7 || month==8)
            season = "letu";
        else if (month==9 || month==10 || month==11)
            season = "oseni";
        else
            season="вымышленным месяцам";
        System.out.println("апрель относится к " + season + ".");
    }
}
