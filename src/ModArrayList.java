import java.util.ArrayList;

public class ModArrayList<D> extends ArrayList<D> {

    public D getUsingMod(int Num) {
        int ValidNum = Math.abs(Num) % this.size();
        return  this.get(ValidNum);
    }
}
