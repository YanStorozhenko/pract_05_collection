package collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection<T> {
    private List<T> items;

    public ArrayListCollection() {
        this.items = new ArrayList<>();
    }

    // Create (додавання елемента)
    public void create(T item) {
        items.add(item);
    }

    // Read (читання всіх елементів)
    public List<T> readAll() {
        return new ArrayList<>(items);
    }

    // Read (читання одного елемента за індексом)
    public T read(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null; // або можна викидати виняток
    }

    public void update(int index, T newItem) {
        if (index >= 0 && index < items.size()) {
            items.set(index, newItem);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        }

    }

    public int length() {
        return items.size();
    }



}

