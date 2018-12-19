import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {


    @BeforeMethod
    public void printname(){
        System.out.println("before test");
    }

    @BeforeMethod
    public void printnamema(){
        System.out.println("before test 2");
    }



    @Test
    public void PrintName() {
        System.out.println("hii this is abhishek shukla ");
    }
}



