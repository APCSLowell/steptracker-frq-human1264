import java.util.ArrayList;
public class StepTracker
{
 private int min = 0;
 StepTracker(int x){
  min = x;
 }
 private int activeDays = 0;
 private int days = 0; private int step = 0;
 public void addDailySteps(int steps){
  days++;
  step+=steps;
  if(steps>=min){
   activeDays++;
  }
 }
 public int activeDays(){return(activeDays);}
 public double averageSteps(){
  if(days == 0){return(0);}
  return((double)step/days);
 }
} 
