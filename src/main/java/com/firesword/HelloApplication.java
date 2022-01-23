package com.firesword;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/fxml/Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);

        //设置标题
        stage.setTitle("火炎剑");
        //设置窗口不可拉伸
        stage.setResizable(false);
        //设置图片
        stage.getIcons().add(new Image(HelloApplication.class.getResource("/img/huoyanjian.png").toString()));

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}