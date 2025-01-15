public class Averager {
    private int sum = 0;
    private int count = 0;
        public int getSum() {
        return sum;
    }
        public void add(int value) {
        sum += value;
        count++;
    }
        public int getCount() {
        return count;
    }
        public double getAverage() {
        if (count == 0) {
            return 0.0; 
        } else {
            return (double) sum / count; 
        }
    }
}
