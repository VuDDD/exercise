package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.TextModel;
import view.TextEditorView;

public class TextEditorController {

    private TextModel model;
    private TextEditorView view;

    public TextEditorController(TextModel model, TextEditorView view) {
        this.model = model;
        this.view = view;

        view.addSaveButtonListener(e -> save());
        view.addLoadButtonListener(e -> load());
    }

    private void save() {
        String content = view.getText();
        try (FileWriter writer = new FileWriter(model.getFilePath())) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void load() {
        try (Scanner scanner = new Scanner(new File(model.getFilePath()))) {
            String content = scanner.useDelimiter("\\A").next();
            view.setText(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

