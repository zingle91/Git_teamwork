import view.MainView;

public class Univ_Main {
	
	MainView mainview;
	
	public Univ_Main() {
		mainview = new MainView();
		mainview.setSize(400,200);
		mainview.setVisible(true);
	}

	public static void main(String[] args) {
		new Univ_Main();

	}

}
