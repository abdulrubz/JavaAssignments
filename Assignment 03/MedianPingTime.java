import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianPingTime {
    public ArrayList<Double> findPingTimes(String host, int packets) {
        ArrayList<Double> timeList = new ArrayList<Double>();
        try {
            Process process = Runtime.getRuntime().exec("ping -c " + packets + " " + host);
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = null;
            while ((line = br.readLine()) != null) {
                int timeIndex = line.indexOf("time");
                int msIndex = line.indexOf("ms");
                if(timeIndex != -1 && msIndex != -1) {
                    Double time = Double.parseDouble(line.substring(timeIndex + 5, msIndex-1));
                    timeList.add(time);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return timeList;
    }

    public double findMedian(ArrayList<Double> timeList){
        double median;
        int size = timeList.size();
        Collections.sort(timeList);
        int index = size/2;
        if(size % 2 == 0) {
            median = timeList.get(index) + timeList.get(index - 1);
        } else {
            median = timeList.get(index);
        }
        return median;
    }

    public void testMedianPingTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the host address");
        String host = scanner.nextLine();
        System.out.println("Enter the number of packets");
        int packets = scanner.nextInt();
        ArrayList<Double> timeList = findPingTimes(host, packets);
        double median = findMedian(timeList);
        System.out.println("The median is "+median);
    }

    public static void main(String[] args) {
        MedianPingTime m = new MedianPingTime();
        m.testMedianPingTime();
    }
}
