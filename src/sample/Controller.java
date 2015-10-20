package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {
    @FXML
    TextField addressBar;
    @FXML
    WebView webView;

    public void goToAddress() {
        String address = addressBar.getText();
        if (!address.startsWith("http")) {
            address = "http://" + address;
        }
        WebEngine engine = webView.getEngine();
        engine.load(address);
    }

    public void onKeyPressed(KeyEvent event) {

    }
}
