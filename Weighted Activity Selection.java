import java.util.Comparator;
import java.util.*;
class Main{
    static class Job{
        Integer start;
        Integer end;
        Integer profit;

        Job(int start, int end, int profit){
            this.start=start;
            this.end=end;
            this.profit=profit;
        }

        Job(){}

        void printjobs(){
            System.out.println(start+" "+end+" "+profit);
        }
    }

    public static void main(String[] args){
        int[] startTime = {1,2,3,3};
        int[] endTime = {3,4,5,6};
        int[] profit = {50,10,40,70};



        jobScheduling(startTime, endTime, profit);

    }

    static void jobScheduling(int[] startTime,int[] endTime,int[] profit){

        Job[] job=new Job[startTime.length];
        for (int i=0;i<startTime.length;i++){
            job[i]=new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(job, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                    return o1.start.compareTo(o2.start);
            }
        });
        /*for (int i=0;i<startTime.length;i++){
            job[i].printjobs();
        }*/

        int[] maxprofit=new int[startTime.length];

        for(int i=0;i<startTime.length;i++){
            //maxprofit[i]=0;
            for(int j=0;j<i;j++){
                if(job[j].end<=job[i].start && maxprofit[i]<maxprofit[j])
                    maxprofit[i]=maxprofit[j];
            }
            maxprofit[i]+=job[i].profit;
        }
        int max=maxprofit[0];
        for(int i=0;i<maxprofit.length;i++){
            if(maxprofit[i]>max)
                max=maxprofit[i];
            System.out.println(maxprofit[i]);
        }
           System.out.println(max);

    }

}