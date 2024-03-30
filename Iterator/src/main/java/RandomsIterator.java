import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {
    int min,max;
    public RandomsIterator(int min,int max){
        this.min = min;
        this.max = max;
    }
    Random random = new Random();

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int value = random.nextInt(min,max) + 1;
        return value;
    }
}
