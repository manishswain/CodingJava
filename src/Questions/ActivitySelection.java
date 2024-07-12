package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    static Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {

        @Override
        public int compare(Activity o1, Activity o2) {
            return o1.getFinishTime() - o2.getFinishTime();
        }

    };

    public static void activitySelection(List<Activity> activityList) {
        Collections.sort(activityList, finishTimeComparator);
        System.out.println(activityList);
        Activity previousActivity = activityList.get(0);

        System.out.println("After activity Selection...");
        System.out.println(previousActivity);

        for (int i = 1; i < activityList.size(); i++) {
            Activity currentActivity = activityList.get(i);
            if (currentActivity.getStartTime() >= previousActivity.getFinishTime()) {
                System.out.println(currentActivity);
                previousActivity = currentActivity;
            }
        }
    }

}

class Activity {
    private String name;
    private int startTime;
    private int finishTime;

    public Activity(String name, int startTime, int finishTime) {
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "Activity [name=" + name + ", startTime=" + startTime + " finishTime=" + finishTime + "]";
    }
}

class ActivitySelectionMain {
    public static void main(String[] args) {
        List<Activity> activityList = new ArrayList<>();

        activityList.add(new Activity("A1", 0, 6));
        activityList.add(new Activity("A2", 3, 4));
        activityList.add(new Activity("A3", 1, 2));
        activityList.add(new Activity("A4", 5, 8));
        activityList.add(new Activity("A5", 5, 7));
        activityList.add(new Activity("A6", 8, 9));

        System.out.println("User given information");
        for (int i = 0; i < activityList.size(); i++) {
            Activity activity = activityList.get(i);
            System.out.println(activity);
        }

        ActivitySelection.activitySelection(activityList);
    }
}