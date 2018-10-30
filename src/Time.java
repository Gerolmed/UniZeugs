import com.sun.deploy.util.StringUtils;

public class Time {

    /**
     * Calculate time diff
     * @param origin Start time
     * @param compare End time
     * @return - seconds
     */
    public long calculateTimeDiff(ClockTime origin, ClockTime compare) {
        long rawOrigin;
        long rawCompare;

        rawOrigin = origin.toSeconds();
        rawCompare = compare.toSeconds();

        return rawCompare - rawOrigin;
    }

    private static class ClockTime {
        private int hour, minute, second;

        public ClockTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public int getHour() {return hour;}
        public int getMinute() {return minute;}
        public int getSecond() {return second;}

        public long toSeconds() {
            return (getHour() * 60 + getMinute())*60+getSecond();
        }
    }

    public static void main(String[] args) {
        Time time = new Time();
        ClockTime midnight = new ClockTime(0,0,0);
        ClockTime endOfDay = new ClockTime(24, 0, 0);

        System.out.println(time.calculateTimeDiff(midnight, new ClockTime(15,10,30)) + " seconds have passed since midnight.");
        System.out.println(time.calculateTimeDiff(new ClockTime(15,10,30), endOfDay) + " seconds are left until midnight.");
        System.out.println("Since I started with the task "+time.calculateTimeDiff(new ClockTime(15,10,30), new ClockTime(15, 17, 51)) + " seconds have passed.");


    }
}
