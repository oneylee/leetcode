//

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int i = 0;
        int sum = 0;
        while(i < len) {
            sum += gas[i] - cost[i];
            i++;
        }
        if(sum < 0)
            return -1;

        int start = len -1;
        int end = 0;
        sum = gas[start] - cost[start];
        while(start > end){
            if(sum >= 0){
                sum += gas[end] - cost[end];
                end++;
            }else {
                start--;
                sum += gas[start] - cost[start];
            }
        }
        return sum >= 0 ? start : -1;
    }


    public static void main(String[] args) {
        int[] gas = {1, 3, 4, 2};
        int[] cost = {2, 2, 2, 3};
        GasStation gasStation = new GasStation();
        System.out.println(gasStation.canCompleteCircuit(gas, cost));


    }
}
