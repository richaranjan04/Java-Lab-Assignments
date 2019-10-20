package ThreadVoteCount;

import Election.CountVote;
import Election.VoteId;
import java.util.Vector;

/**
 *
 * @author richaranjan
 */
public class MultiThreadVote {
    public static void main(String[] args) {
        Vector votevec = new Vector(240);   // creating a vote array for 240 votes

        VoteId a = new VoteId(1, votevec);
        a.start();

        VoteId b = new VoteId(2, votevec);
        b.start();

        VoteId c = new VoteId(3, votevec);
        c.start();

        try{
            a.join();
            b.join();
            c.join();
            System.out.println("Voting has ended!");
        }catch(Exception e){System.out.println(e);}

        CountVote ac = new CountVote(1, votevec);
        CountVote bc = new CountVote(2, votevec);
        CountVote cc = new CountVote(3, votevec);

        ac.start();
        bc.start();
        cc.start();

        try{
            ac.join();
            bc.join();
            cc.join();
            System.out.println("Counting has ended!");
        }catch(Exception e){System.out.println(e);}

        int av = ac.count;
        int bv = bc.count;
        int cv = cc.count;

        System.out.println("elections.Vote Vector:" + "\n" + votevec);
        System.out.println(av + " votes for A");
        System.out.println(bv + " votes for B");
        System.out.println(cv + " votes for C");

        if(av >= bv && av >= cv){
            if(av == bv || av == cv)
                System.out.println("Tie in elections!");
            else
                System.out.println("A has won the elections!");
        }
        else if(bv >= av && bv >= cv){
            if(av == bv || bv == cv)
                System.out.println("Tie in elections!");
            else
                System.out.println("B has won the elections!");
        }
        else if(cv >= av && cv >= bv){
            if(cv == bv || cv == av)
                System.out.println("Tie in elections!");
            else
                System.out.println("C has won the elections!");
        }
    }
}