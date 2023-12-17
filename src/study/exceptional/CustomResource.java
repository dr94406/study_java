package study.exceptional;

public class CustomResource implements AutoCloseable{

    public CustomResource() {
        System.out.println("CustomResource Constructor");

    }

    public void printMessage() {
        System.out.println("CustomResource Print Message");
    }

    @Override
    public void close() throws Exception {
        System.out.println("CustomResource close");
    }
}
