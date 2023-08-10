import java.util.*;
public class vec{
    enum week{
        monday ,tuesday,wednesday,thursday,friday,saturday,sunday
    }
    public static void main(String[] args) {
        week Week;
        Week = week.monday;
        for(week day: week.values()){
            System.out.print(day+" ");
        }
    }
}

