package collections;


import views.PrintBigNumber;

public class StatisticalMeasurements {
    public int itemsCount;
    public double createTime;
    public double removeTime;
    public double updateTime;
    public double deleteTime;
    public double filterTime;
    public double sortTime;
    public double findTime;
    public double concatTime;
    public double reduceTime;
    public double matchTime;
    public double counting;
    public double sumTime;
    public double averageTime;

    public StatisticalMeasurements(int itemsCount, double createTime, double removeTime, double updateTime, double deleteTime, double filterTime, double sortTime, double findTime, double concatTime, double reduceTime, double matchTime, double counting, double sumTime, double averageTime) {
        this.itemsCount = itemsCount;
        this.createTime = createTime;
        this.removeTime = removeTime;
        this.updateTime = updateTime;
        this.deleteTime = deleteTime;
        this.filterTime = filterTime;
        this.sortTime = sortTime;
        this.findTime = findTime;
        this.concatTime = concatTime;
        this.reduceTime = reduceTime;
        this.matchTime = matchTime;
        this.counting = counting;
        this.sumTime = sumTime;
        this.averageTime = averageTime;

    }
    public StatisticalMeasurements() {
        this.itemsCount = 0;
        this.createTime = 0;
        this.removeTime = 0;
        this.updateTime = 0;
        this.deleteTime = 0;
        this.filterTime = 0;
        this.sortTime = 0;
        this.findTime = 0;
        this.concatTime = 0;
        this.reduceTime = 0;
        this.matchTime = 0;
        this.counting = 0;
        this.sumTime = 0;
        this.averageTime = 0;

    }

    public void  statisticalPrint() {
        PrintBigNumber.printBigNumber(this.itemsCount);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.createTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.reduceTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.updateTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.deleteTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.filterTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.sortTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.findTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.concatTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.reduceTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.matchTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.counting);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.sumTime);
        System.out.print("\t");
        PrintBigNumber.printBigNumber(this.averageTime);
        System.out.println();

    }

}

