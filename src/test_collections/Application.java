package test_collections;

import collections.ArrayListCollection;
import collections.CollectionType;
import collections.StatisticalMeasurements;
import controls.ArrayListControls;
import java.util.HashMap;
import java.util.Map;


public class Application {
    public static String [][] collectionCountType = new String[8][3];

    public static  Map<String, StatisticalMeasurements> stateTable = new HashMap<>();

    public static void run() {
        System.out.println("Тестування колекцій");

        runArrayListCollection();



        stateTable.entrySet().stream()
                .forEach(entry -> {
                    System.out.println("Collection: " + entry.getKey());
                    entry.getValue().statisticalPrint();
                });
    }

    public static void main(String[] args) {
        for (CollectionType s:CollectionType.values()) {
            collectionCountType[s.ordinal()][0] = s.name() + "50000";
            collectionCountType[s.ordinal()][1] = s.name() + "500000";
            collectionCountType[s.ordinal()][2] = s.name() + "1000000";
        }

        run();
    }

    public static void runArrayListCollection() {
        StatisticalMeasurements staticTime = new StatisticalMeasurements();
        ArrayListCollection<String> arrayListStringCollection = new ArrayListCollection<>();
        staticTime.itemsCount = 50000;
        staticTime.createTime = ArrayListControls.measureTime(arrayListStringCollection, staticTime.itemsCount);
        stateTable.put(CollectionType.testArrayList + "50000", staticTime);

        staticTime.itemsCount = 500000;
        staticTime.createTime = ArrayListControls.measureTime(arrayListStringCollection, staticTime.itemsCount);
        stateTable.put(CollectionType.testArrayList + "500000", staticTime);

        staticTime.itemsCount = 1000000;
        staticTime.createTime = ArrayListControls.measureTime(arrayListStringCollection, staticTime.itemsCount);
        stateTable.put(CollectionType.testArrayList + "1000000", staticTime);

    }
}

