package main;

import controller.TextEditorController;
import model.TextModel;
import view.TextEditorView;

public class Main {

    private static TextEditorController controller;

	public static void main(String[] args) {
        TextModel model = new TextModel();
        model.setFilePath("myfile.txt");

        TextEditorView view = new TextEditorView(); // Gọi hàm khởi tạo

        setController(new TextEditorController(model, view));

        view.setVisible(true);

    }

	public static TextEditorController getController() {
		return controller;
	}

	public static void setController(TextEditorController controller) {
		Main.controller = controller;
	}

}

