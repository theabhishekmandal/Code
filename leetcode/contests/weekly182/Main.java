import java.util.*;
class UndergroundSystem {
    static class detail{
        public String startStation;
        public String stopStation;
        public int startTime;
        public int stopTime;
        detail() {
        }
    }
    private Map<Integer, detail> map;
    private Map<String, LinkedList<detail>> stationMap;
    public UndergroundSystem() {
        map = new HashMap<>();
        stationMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        detail detail = new detail();
        detail.startStation = stationName;
        detail.startTime = t;
        map.put(id, detail);
    }

    public void checkOut(int id, String stationName, int t) {
        detail personDetail = map.get(id);
        personDetail.stopTime = t;
        personDetail.stopStation = stationName;
        map.put(id, personDetail);

        String fullStation = personDetail.startStation + personDetail.stopStation;
        LinkedList<detail> list = stationMap.get(fullStation);
        if(list == null)
            list = new LinkedList<>();
        list.add(personDetail);
        stationMap.put(fullStation, list);
    }

    public double getAverageTime(String startStation, String endStation) {
        LinkedList<detail> list = stationMap.get(startStation + endStation);
        return list.stream().mapToDouble(x -> x.stopTime - x.startTime).average().getAsDouble();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */

public class Main{
    public static void main(String[] args) {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge"));       // return 14.0. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));       // return 11.0. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
        undergroundSystem.checkIn(10, "Leyton", 24);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));       // return 11.0. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
        undergroundSystem.checkOut(10, "Waterloo", 38);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));       // return 12.0. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
    }
}
