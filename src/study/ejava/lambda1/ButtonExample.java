package study.ejava.lambda1;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼 클릭");
		});


		btnOk.click();

		Button btnCalcel = new Button();
		btnCalcel.setClickListener(() -> {
			System.out.println("Cancel 버튼 클릭");
		});

		btnCalcel.click();
	}
}
