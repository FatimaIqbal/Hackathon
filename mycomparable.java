import java.util.Comparator;
import model.pojo.Buses;
public class MyComparable implements Comparator<Buses>{
 
    
     public enum Field {
        fare;
    }
     private Field field;
    @Override
public int compare(Buses mdi1, Buses mdi2) {
    int comparison = 0;
    switch(field) {
    case fare:
        comparison = mdi1.getFare().compareTo(mdi2.getFare());
    
    }
    return comparison;
}
} 
