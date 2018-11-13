package java21;


import javax.swing.JFrame;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

public class Web2 extends JFrame {

	public Web2() {
		JFXPanel jfxPanel = new JFXPanel();
		add(jfxPanel);
		setSize(500, 500);

		Platform.runLater(() -> {
		    WebView webView = new WebView();
		    jfxPanel.setScene(new Scene(webView));
		    webView.getEngine().load("http://www.kgitbank.com/");
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		Web2 web2 = new Web2();
	}
}
