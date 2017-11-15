import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Plural<T> {
    public ArrayList<T> tList = new ArrayList<T>();

    public ArrayList<T> getTList() {
        return tList;
    }

    public Set<T> section (ArrayList<T> tList) {
        int size;
        if (tList.size() > this.tList.size()){
            size = tList.size();
        } else {size = this.tList.size();}
        ArrayList<T> tArrayList = new ArrayList<T>(size);
        T[] ts = (T[]) tList.toArray();
        T[] thisTs = (T[]) this.tList.toArray();
        for(int i = 0; i < thisTs.length; i++) {
            for(int j = 0; j < ts.length; j++) {
                if (ts[j] == (thisTs[i])) {
                    tArrayList.add(thisTs[i]);
                }
            }
        }
        Set<T> set = new LinkedHashSet<T>(tArrayList);
        return set;
    }

    public Set<T> combining (ArrayList<T> tList) {
        ArrayList<T> tArrayList = new ArrayList<T>(this.tList.size() + tList.size());
        tArrayList.addAll(tList);
        tArrayList.addAll(this.tList);
        Set<T> set = new LinkedHashSet<T>(tArrayList);
        return set;
    }
}
