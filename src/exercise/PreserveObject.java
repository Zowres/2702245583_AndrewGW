package exercise;

public class PreserveObject {
    
    class Room {
        private TempRange range;

        public Room(int lowest, int highest) {
            this.range = new TempRange(lowest, highest);
        }

        // Refactored: Passing the whole TempRange object instead of two int values
        public boolean withinPlan(HeatingPlan plan) {
            return plan.withinRange(range);
        }

        public TempRange getTempRange() {
            return range;
        }
    }

    class HeatingPlan {
        private TempRange range;

        public HeatingPlan(int from, int to) {
            this.range = new TempRange(from, to);
        }

        // Refactored: Now accepting a TempRange object instead of two separate ints
        public boolean withinRange(TempRange roomRange) {
            return (roomRange.getLow() >= range.getLow() && roomRange.getHigh() <= range.getHigh());
        }
    }

    class TempRange {
        private int low;
        private int high;

        public TempRange(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public int getLow() {
            return low;
        }

        public int getHigh() {
            return high;
        }
    }

    public static void main(String[] args) {
        PreserveObject p = new PreserveObject();
        p.test();
    }

    private void test() {
        Room r = new Room(15, 34);
        System.out.println("Within 20-30: " + r.withinPlan(new HeatingPlan(20, 30)));
        System.out.println("Within 25-34: " + r.withinPlan(new HeatingPlan(25, 34)));
        System.out.println("Within 10-40: " + r.withinPlan(new HeatingPlan(10, 40)));
    }
}
