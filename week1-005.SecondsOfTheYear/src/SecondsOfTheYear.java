public class SecondsOfTheYear {

    public static void main(String[] args) {   
        // In below an incomplete version of the program. Please complete it!
        
        int daysInYear = 365; //Assume not leap yr; 365 days in 1 year
        int hoursInDay = 24; //24 hours per day on Earth
        int minutesInHour = 60; //60 mins per hr; 24 hrs * 60 mins == 1440 mins
        int secondsInMinute = 60; //60 secs per min; 1440 mins & 60 secs == 86400 secs
        
        int secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;

        //b/c secs in 1 year math = 365*24*60*60

        System.out.println("There are " + secondsInYear + " seconds in a year");
    }

}
