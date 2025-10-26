package vertusa;

import java.util.Scanner;

import java.util.*;

public class Submarine {
    private HashMap<String, Deque<String>> fleetInventory;  // Sub ID -> Deque of targets
    private LinkedList<String> launchQueue;                 // Global launch sequence
    private int totalLaunches;                              // Counter for executed launches

    public Submarine() {
        fleetInventory = new HashMap<>();
        launchQueue = new LinkedList<>();
        totalLaunches = 0;
    }

    // Add a submarine with initial targets (add to back of Deque for FIFO)
    public void addSubmarine(String subId, List<String> initialTargets) {
            if(subId.isEmpty())return;
           Deque<String> targets = new ArrayDeque<>();
           for(String target : initialTargets) {
               targets.addLast(target);
           }
           fleetInventory.put(subId, targets);

    }

    // Enqueue a launch if target is ready (at front of Deque)
    public void enqueueLaunch(String subId, String target) {
            if(subId.isEmpty())return;
            Deque<String> targets = fleetInventory.get(subId);
            String first=targets.peekFirst();
            for(String t : targets) {
                if(target.equals(first)||first!=null) {
                    launchQueue.addLast(target);
                    targets.removeFirst();
                }
                else {
                    System.out.println("Target Not Found");
                }
            }
    }

    // Override priority: Move target to front of Deque
    public void overridePriority(String subId, String target) {
            if(subId.isEmpty())return;
            Deque<String> targets = fleetInventory.get(subId);
            if(targets.isEmpty())return;
            launchQueue.addLast(target);
    }

    // Execute all queued launches, print with boom, clear queue, update counter
    public void executeLaunches() {
            System.out.println("-----Launch Queue------");
            while(!launchQueue.isEmpty()) {
                String target = launchQueue.pollFirst();
                System.out.println("Launched " + target);
                totalLaunches++;
            }
    }

    public static void main(String[] args) {
        Submarine control = new Submarine();
        Scanner scanner = new Scanner(System.in);
        Submarine sub = new Submarine();
        boolean start = true;
        while (start) {
            //Scan console and execute commands
            System.out.println("1)Add Submarine \n" +
                    "2)enqueueLaunch \n"
                     + "3)overridePriority \n"
                     + "4)executeLaunches \n"
                    + "5)Exit \n"
                        );
            int choice = scanner.nextInt();
            switch (choice) {
                    case 1:System.out.println("Enter Submarine ID");
                    String subId = scanner.next();
                    System.out.println("Enter No Of Targets");
                    int noOfTargets = scanner.nextInt();
                    List<String> targets = new ArrayList<>();
                    for (int i = 0; i < noOfTargets; i++) {
                        targets.add(scanner.next());
                    }
                    sub.addSubmarine(subId, targets);
                    break;
                    case 2:System.out.println("Enter Submarine ID");
                    String id = scanner.next();
                    System.out.println("Enter  Target");
                    String target = scanner.next();
                    sub.enqueueLaunch(id, target);
                        break;
                    case 3:System.out.println("Enter Submarine ID");
                        String id1 = scanner.next();
                        System.out.println("Enter  Target");
                        String target1 = scanner.next();
                        sub.overridePriority(id1, target1);
                    break;
                    case 4:sub.executeLaunches();
                        break;
                        case 5:start=false;
                            break;

                                default:break;
            }


        }
        scanner.close();
    }
}
