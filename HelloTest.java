public class HelloTest {

    public static void main(String[] args) {

        if(!Hello.message().equals("Hello DevOps Pipeline")){
            throw new RuntimeException("Test Failed");
        }

        System.out.println("Test Passed");
    }
}
