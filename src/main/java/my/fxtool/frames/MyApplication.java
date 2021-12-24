package my.fxtool.frames;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("我的 Webview");
        primaryStage.show();
        // create a webview object
        WebView w = new WebView();
        // get the web engine
        WebEngine e = w.getEngine();
        // load a website
        e.load("http://localhost:8080/index.html");

        // create a scene
        Scene scene = new Scene(w, w.getPrefWidth(),
                w.getPrefHeight());
        // set the scene
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class , args);
        launch();
    }
}
