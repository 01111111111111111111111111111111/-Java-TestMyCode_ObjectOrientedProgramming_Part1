import nhlstats.NHLStatistics; //import NHL raw data to be used, manipulated & sorted in main method

public class Main { //program Main.java

    public static void main (String[] args){ //main method

          //1) TOP TEN BY POINTS
          System.out.println(""); //spacing; enter
          System.out.println("Top ten by points: "); //header of the top 10 by points
          NHLStatistics.sortByGoals(); //1st part: sort top ten players by goals scored
          NHLStatistics.top(10); //top 10

            //2) TOP 25 BY PENALTIES
            System.out.println("");
            System.out.println("Top twenty five by penalties: "); //header of 2nd set top 25 by penalties
            NHLStatistics.sortByPenalties(); //sort by penalties
            NHLStatistics.top(25); //top 25

                //3) SEARCH SIDNEY CROSBY STATS
                System.out.println("");
                System.out.println("Sidney Crosby Statistics: ");
                NHLStatistics.searchByPlayer("Sidney Crosby"); //search for stats relevant to Crosby

                    //4) PHILADELPHIA FLYERS ROSTER STATS
                    System.out.println("");
                    System.out.println("Philadelphia Flyers Team Statistics: "); //just PHI stats
                    NHLStatistics.teamStatistics("PHI"); //exercise wanted us to pay attention to how it is sorted by default
                                                         //possibly by penalties due to last top command was by penalties in section 2)
                        //5) ANAHEIM DUCKS ROSTER SORTED BY POINTS
                        System.out.println("");
                        System.out.println("Anaheim Ducks Roster by Points: ");
                        NHLStatistics.sortByPoints(); //sort only accepts int as input, leaving blank to sort last team "ANA"
                        NHLStatistics.teamStatistics("ANA"); //Print the points sorted; combining Roster stats & sortByPoints to get sorted roster by points

    }
}
