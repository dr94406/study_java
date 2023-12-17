package study.exceptional;

public class CustomResourceResponse {
    public static void main(String[] args) {
        try (CustomResource cr = new CustomResource()) {
            cr.printMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
