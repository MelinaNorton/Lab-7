package cpsc2150.listDec.cpsc2150.listDec;
import java.util.List;
import java.util.Random;

public interface IShuffleList<T> extends List<T> {
    /**
     * @param swaps: the number of times swap() will be called
     * @pre: swaps >= 0
     * @post: List will be shuffled
     */
    default void shuffle(int swaps) {
        Random rand = new Random();

        for(int i=0; i<swaps; i++){
            int rand_num1 = rand.nextInt(this.size());
            int rand_num2 = rand.nextInt(this.size());
            swap(rand_num1, rand_num2);
        }
    }

    /**
     * @param i: the first index to be swapped
     * @param j: the second index to be swapped
     * @pre i & j >= 0 && < List.size()
     * @post: List[i] = List[j]; List[j] = List[i]
     */
    default void swap(int i, int j) {
        T i_val = this.get(i);
        T j_val = this.get(j);
        this.add(i, j_val);
        this.add(j, i_val);
    }

    public default void randomize(){

    }
}
