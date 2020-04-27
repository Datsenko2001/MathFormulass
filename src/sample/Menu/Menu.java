package sample.Menu;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Menu {
    public Button button;
    public String pathToTheFile;

    @FXML
    private Button properties;
    @FXML
    private Button polynomials;
    @FXML
    private Button interest;
    @FXML
    private Button linearequations;
    @FXML
    private Button logarithmicequations;
    @FXML
    private Button progressions;
    @FXML
    private Button button1;

    @FXML
    void initialize() {
        properties.setOnAction(actionEvent -> {  //войти
            openNewScene("Властивості степеня", "/sample/PropertiesButton/propertiesButt.fxml");
        });
        polynomials.setOnAction(actionEvent -> {  //войти
            openNewScene("Многочлени", "/sample/PolynomialsButton/polynomials.fxml");
        });
        interest.setOnAction(actionEvent -> {  //войти
            openNewScene("Відсотки", "/sample/InterestButton/interest.fxml");
        });
        linearequations.setOnAction(actionEvent -> {  //войти
            openNewScene("Лінійні рівняння", "/sample/LinearEquationsButton/linearequations.fxml");
        });
        logarithmicequations.setOnAction(actionEvent -> {  //войти
            openNewScene("Логарифмічні рівняння", "/sample/LogarithmicEquationsButton/logarithmicequations.fxml");
        });
        progressions.setOnAction(actionEvent -> {  //войти
            openNewScene("Прогресії", "/sample/ProgressionsButtons/progressions.fxml");
        });



    }
    public void theorymethods(){
        button1.setOnAction(event -> {
            JPanel myRootPane = new JPanel();
            JOptionPane.showMessageDialog( myRootPane, "Введите число в текстовое поле А, а после - B. Далее надмите кнопку ОБЧИСЛИТИ. В текстовом поле, которое ниже, указан ваш результат. Готово!" , "Довідка", JOptionPane.DEFAULT_OPTION );

        });
    }

    public void openNewScene(String title, String pathToTheFile) {
        System.out.println("You clicked me!");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(pathToTheFile));
        Parent root1 = null;
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
