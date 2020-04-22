
public class Time {

    private int second;
    private int minute;
    private int hour;
    

    Time(){
        second = 0;
        minute = 0;
        hour = 0;
    }

    Time(String t){
        second = Integer.parseInt(t.substring(6,8));
        minute = Integer.parseInt(t.substring(3,5));
        hour = Integer.parseInt(t.substring(0,2));
    }

    public void setTime(String st){
        second = Integer.parseInt(st.substring(6,8));
        minute = Integer.parseInt(st.substring(3,5));
        hour = Integer.parseInt(st.substring(0,2));
    }

    public void addSecond(){
        second += 1;

        if(second == 60){
          second = 0;
          minute += 1;
          if(minute == 60){
            minute = 0;
            hour += 1;
            if(hour == 24){
              hour = 0;
            }
          }
        }

    }

    public void addMinute(){
        minute += 1;
        if(minute == 60){
            minute = 0;
            hour += 1;
            if(hour == 24){
              hour = 0;
            }
        }
    }

    public void addHour(){
        hour += 1;
        if(hour == 24){
              hour = 0;
            }
    }

    public void setSecond(int ss){
        second = ss;
    }

    public void setHour(int sh){
        hour = sh;
    }

    public void setMinute(int sm){
        minute = sm;
    }
    
    public void printTime(){

        String ss = "";
        String mm = "";
        String hh = "";

        if(second < 10){
          ss = "0" + String.valueOf(second);
        }
        else{
          ss = String.valueOf(second);
        }

        if(minute < 10){
          mm = "0" + String.valueOf(minute);
        }
        else{
          mm = String.valueOf(minute);
        }

        if(hour < 10){
          hh = "0" + String.valueOf(hour);
        }
        else{
          hh = String.valueOf(hour);
        }
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}