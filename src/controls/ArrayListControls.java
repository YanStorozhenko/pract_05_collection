package controls;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import collections.ArrayListCollection;
import views.PrintBigNumber;

import java.util.Arrays;

public class ArrayListControls {
    public ArrayListControls() {

    }

    public static void addItems(int itemCount, ArrayListCollection<String> arrayList) {
        int[] indices = new int[itemCount];
        Arrays.setAll(indices, i -> i);

        Arrays.stream(indices)
                .forEach(i -> arrayList.create("item" + i));
    }
    public static double measureTime(ArrayListCollection<String> arrayList, int itemCount) {
        LocalDateTime startTime = LocalDateTime.now();
        ArrayListControls.addItems(itemCount, arrayList);
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);
        double staticTime = duration.getNano();
        return staticTime;
    }
}


