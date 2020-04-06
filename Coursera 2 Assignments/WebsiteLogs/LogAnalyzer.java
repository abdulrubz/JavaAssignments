

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
     public LogAnalyzer() {
         records = new ArrayList<LogEntry>();
     }
        
     public void readFile(String filename) {
         FileResource fr = new FileResource(filename);
         for(String line : fr.lines()) {
             LogEntry e = WebLogParser.parseEntry(line);
             records.add(e);
         }
     }
        
     public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
     }

     public int countUniqueIPs() {
         ArrayList<String> uniqueIPList = new ArrayList<String>();
         for (LogEntry e : records) {
             if(!(uniqueIPList.contains(e.getIpAddress()))) {
                 uniqueIPList.add(e.getIpAddress());
             }
         }
         return uniqueIPList.size();
     }

     public void printAllHigherThanNum(int num) {
         System.out.println("Log entries with higher status code than "+num+"are :");
         for (LogEntry e : records) {
             if(e.getStatusCode() > num) {
                 System.out.println(e);
             }
         }
     }

     public ArrayList<String> uniqueIPVisitsOnDay(String someday) {
         ArrayList<String> UniqueIpList = new ArrayList<String>();
         for (LogEntry e : records) {
             if(e.getAccessTime().toString().contains(someday) && !UniqueIpList.contains(e.getIpAddress())) {
                 UniqueIpList.add(e.getIpAddress());
             }
         }
         return UniqueIpList;
     }

     public int countUniqueIPsInRange(int low, int high) {
         ArrayList<String> uniqueIPs = new ArrayList<String>();
         for (LogEntry e : records) {
             int status = e.getStatusCode();
             if(status >= low && status <= high) {
                 if(!uniqueIPs.contains(e.getIpAddress())) {
                     uniqueIPs.add(e.getIpAddress());
                 }
             }
         }
         return uniqueIPs.size();
     }

     public HashMap<String, Integer> countVisitsPerIP() {
         HashMap<String, Integer> counts = new HashMap<String, Integer>();
         for (LogEntry e : records) {
             String IP = e.getIpAddress();
             if(!counts.containsKey(IP)) {
                 counts.put(IP, 1);
             } else {
                 int count = counts.get(IP);
                 counts.put(IP, count + 1);
             }
         }
         return counts;
     }
     
}
