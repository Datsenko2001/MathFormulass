package sample.ProgressionsButtons;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;

import javax.swing.*;

public class ControllerProgressions extends Menu {
    @FXML
    private TextField a11;
    @FXML
    private TextField b11;
    @FXML
    private TextField c11;
    @FXML
    private TextField a22;
    @FXML
    private TextField b22;
    @FXML
    private TextField result1;
    @FXML
    private Button otvet11;
    @FXML
    private TextField result2;
    @FXML
    private Button otvet22;
    @FXML
    private Button information;
    Integer a1, b1, c1;
    int result_field,result;
    double result_field_double;

    @FXML
    void initialize() {
        otvet11.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a11.getText());
            b1 = Integer.valueOf(b11.getText());
            c1 = Integer.valueOf(c11.getText());
            result(a1, b1, c1,result1);
        });
        otvet22.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a22.getText());
            b1 = Integer.valueOf(b22.getText());
            result(a1, b1,result2);
        });
        theorymethods();

    }
    public void theorymethods(){
        information.setOnAction(event -> {
            JPanel myRootPane = new JPanel();
            JOptionPane.showMessageDialog( myRootPane, "Арифметичною прогресією називають послідовність, кожний член якої, починаючи з другого, дорівнює попередньому члену, до якого додається одне й те саме число, яке називають різницею арифметичної прогресії.\n \nГеометричною прогресією називають послідовність, відмінних від нуля чисел, кожний член якої, починається з другого, дорівнює передньому, помноженому на одне й те саме число, яке називають знаменником геометричної прогресії." , "Теорія: Прогресії", JOptionPane.DEFAULT_OPTION );

        });
    }
    public void result(int a,int b,int c,TextField textField){
        result_field=(b-a)/(c-1);
        result=a+(2*result_field);
        textField.setText(String.valueOf(result));
    }
    public void result(double a,double b,TextField textField){
        double k = 1/b;
        result_field_double=a*(Math.pow(k,5));
        textField.setText(String.valueOf(result_field_double));
    }
}