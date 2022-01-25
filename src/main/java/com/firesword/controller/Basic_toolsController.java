package com.firesword.controller;

import com.firesword.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class Basic_toolsController {
    @FXML
    private VBox selectButton;
    @FXML
    private AnchorPane content;

    @FXML
    public void initialize(){
        for (Node node: selectButton.getChildren()){
            node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                refreshPage((node.getAccessibleText()));
            });
        }
        refreshPage("shell");
    }

    private void refreshPage(String page){
        try {
            this.content.getChildren().clear();
            AnchorPane contenPage = FXMLLoader.load(HelloApplication.class.getResource("/fxml/Basic_tools/"+page+".fxml"));

            this.content.getChildren().add(contenPage);
        }catch (Exception e){

        }
    }
}