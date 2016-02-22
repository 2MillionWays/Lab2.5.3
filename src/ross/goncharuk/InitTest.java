package ross.goncharuk;

import java.util.Random;

public class InitTest {

    private int id;
    private static int nextId;

    static {
        int randomNum = (int)(1+(Math.random()*999));
                nextId = randomNum;
    }
    public InitTest(){
        nextId++;
    }
    {
        id = nextId;
    }
    public void getId(){
        System.out.println(id);
    }
}
