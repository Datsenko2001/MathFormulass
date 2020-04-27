package sample.PropertiesButton;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.text.html.ImageView;
import java.io.IOException;

public class ControllerProperties extends Menu {

    @FXML
    private TextField a11;
    @FXML
    private TextField b11;
    @FXML
    private TextField a22;
    @FXML
    private TextField b22;
    @FXML
    private TextField a333;
    @FXML
    private TextField b333;
    @FXML
    private TextField c333;
    @FXML
    private TextField result11;
    @FXML
    private TextField result22;
    @FXML
    private TextField result222;
    @FXML
    private TextField result333;
    @FXML
    private Button otvet11;
    @FXML
    private Button otvet22;
    @FXML
    private Button otvet33;
    @FXML
    private Button information;
    Integer a1;
    Integer b1;
    Integer c1;
    double result_field,result;
    int result_field_a,result_field_b;
    @FXML
    void initialize() {
        otvet11.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a11.getText());
            b1 = Integer.valueOf(b11.getText());
            result(a1,b1,result11);
        });

        otvet22.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a22.getText());
            b1 = Integer.valueOf(b22.getText());
            result(a1,b1,result22,result222);
        });
        otvet33.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a333.getText());
            b1 = Integer.valueOf(b333.getText());
            c1 = Integer.valueOf(c333.getText());
            result(a1,b1,c1,result333);

        });
        theorymethods();
    }
    public void theorymethods(){
        information.setOnAction(event -> {
            JPanel myRootPane = new JPanel();
            JOptionPane.showMessageDialog( myRootPane, "Степенем числа а з натуральним показником n називають добуток n множників, кожний з яких дорівнює а. Степенем числа а з показником 1 називають саме це число.\n Зауважимо, що а0 = 1(а ≠ 0)." , "Теорія: Властивості степеня", JOptionPane.DEFAULT_OPTION );

        });
    }
    public void result(int a,int b,TextField textField){
        result_field=Math.pow(a, b);
        textField.setText(String.valueOf(result_field));
    }
    public void result(int a,int b,TextField textField1,TextField textField2){
        result_field_a=a;
        textField1.setText(String.valueOf(result_field_a));
        result_field_b=b*(-1);
        textField2.setText(String.valueOf(result_field_b));
    }
    public void result(int a,int b, int c,TextField textField){
        result_field=Math.pow(a, c);
        result=Math.pow(result_field,b);
        textField.setText(String.valueOf(result));
    }

}
