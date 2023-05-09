package com.example.rounderjavafx2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu {
    @FXML
    private TextField usernameField;

    @FXML
    private Button joinGameButton;

    @FXML
    private Button createGameButton;

    @FXML
    private void onJoinGameButtonClicked() {
        // Handle join game button click event
    }

    @FXML
    private void onCreateGameButtonClicked(ActionEvent event) throws IOException {
        // Handle create game button click event
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateLobby.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public String getUsername() {
        return usernameField.getText();
    }
}