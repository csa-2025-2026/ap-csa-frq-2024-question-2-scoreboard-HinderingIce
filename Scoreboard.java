/*

# Answer close reading 1 questions here
The first parameter team
use recordPlay
if recordPlay return 0


# Answer close reading 2 questions here
Score
Teams and Score
*/

// Write the class below
public class Scoreboard
{
    private String team1;
    private String team2;
    private int t1score;
    private int t2score;
    private String ActiveTeam;
    public Scoreboard(String t1, String t2)
    {
        team1 = t1;
        team2 = t2;
        ActiveTeam = team1;
    }

    public void recordPlay(int score)
    {
        if(score == 0)
        {
            if(ActiveTeam == team1)
            {
                ActiveTeam = team2;
            }
            else
            {
                ActiveTeam = team1;
            }
        }
        else
        {
            if(ActiveTeam == team1)
            {
                t1score += score;
            }
            else
            {
                t2score += score;
            }
        }
    }

    public String getScore()
    {
        return t1score + " - " + t2score + " - " + ActiveTeam;
    }
}
