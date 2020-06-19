package lab6.ch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Leader {
    public static List<Integer> getLeaders(List<Integer> intList){
        List<Integer>  leaders = new ArrayList<Integer>();

        Collections.reverse(intList);
        int max = intList.get(0);
        leaders.add(max);

        Iterator<Integer> it = intList.iterator();
        int current;
        while(it.hasNext()){
            current = it.next();
            if(current > max){
                leaders.add(current);
                max = current;
            }
        }

        return leaders;
    }
}
