import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class LinqList<T> extends ArrayList<T> {
    public LinqList<T> where(Function<T, Boolean> predicate) {
        LinqList<T> list = new LinqList<>();
        for (T element : this) {
            if (predicate.apply(element)) {
                list.add(element);
            }
        }
        return list;
    }


    public T first() {
        return this.get(0);
    }

    public T first(Function<T, Boolean> predicate) {
        for (T element : this) {
            if (predicate.apply(element)) {
                return element;
            }
        }
        return null;
    }

    public LinqList<T> skip(int count) {
        LinqList<T> list = new LinqList<>();
        for (int i = count; i < this.size(); i++) {
            list.add(this.get(i));
        }
        return list;
    }

    public boolean any() {
        return this.size() > 1;
    }

    public boolean all(Function<T, Boolean> predicate) {
        for (T element : this) {
            if (!predicate.apply(element)) {
                return false;
            }
        }
        return true;
    }

    public T takeLast() {
        return this.get(this.size() - 1);
    }
}
