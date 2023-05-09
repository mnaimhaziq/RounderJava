package com.example.rounderjavafx2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class CreateLobby {
    @FXML
    private ComboBox<Integer> roundsComboBox;

    public void initialize() {
        // Add options to the dropdowns
        roundsComboBox.getItems().addAll(1, 2, 3, 4, 5);
    }

    @FXML
    private void onMainMenuButtonClicked(ActionEvent event) {
        // Handle Main Menu button click
    }

    @FXML
    private void onCreateLobbyButtonClicked(ActionEvent event) {
        // Handle Create Lobby button click
    }
}
