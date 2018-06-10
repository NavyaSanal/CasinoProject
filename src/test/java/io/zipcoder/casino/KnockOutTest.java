package io.zipcoder.casino;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class KnockOutTest {

    Player player1 = new Player("Roy",1000);
    Player player2 = new Player("Froilan",1000);
    Player[] players = {player1, player2};
    KnockOut knockOut = new KnockOut(players);
    ArrayList<Player> playersList;

    @Test
    public void playerArrayListTest(){
        knockOut.playerArrayList();
        Assert.assertEquals(2,playersList.size());
    }


}


