package newspaper.util;

/**
 * @since Aug - 17 - 2013
 * @author Nguyen Hoang Anh
 */
public final class MyConstant {
     /**
     * Day of week
     */
    public static enum DAY_OF_WEEK_ENUM{
        
        SUN(1), MON(2), TUE(3), WED(4), THU(5), FRI(6), SAT(7);
        
        private int value;

        /**
         * Get value of a day of week
         * @return value from 1 - 8
         */
        public int getValue() {
            return value;
        }
        
        private DAY_OF_WEEK_ENUM(int d){
            value = d;
        }
    }
}
