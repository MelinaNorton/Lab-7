package cpsc2150.listDec.cpsc2150.listDec;
import java.util.List;

public interface IShuffleList<T> extends List<T> {
    default void shuffle(int swaps) {

    }

    default void swap(int i, int j) {

    }

    public default void randomize(){

    }
}