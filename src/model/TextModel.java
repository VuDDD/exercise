package model;

import java.awt.Color;
import java.awt.Font;

public class TextModel {

    private String content;
    private String filePath;
    private Font font;
    private Color color;
	public TextModel() {
		super();
	}
	public TextModel(String content, String filePath, Font font, Color color) {
		super();
		this.content = content;
		this.filePath = filePath;
		this.font = font;
		this.color = color;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Font getFont() {
		return font;
	}
	public void setFont(Font font) {
		this.font = font;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
    

}
