package sample.PolynomialsButton;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
public class ControllerPolynomials extends Menu {
    @FXML
    private TextField a11;
    @FXML
    private TextField b11;
    @FXML
    private TextField result;
    @FXML
    private Button otvet1;
    @FXML
    private TextField a22;
    @FXML
    private TextField b22;
    @FXML
    private TextField c22;
    @FXML
    private TextField result2;
    @FXML
    private Button otvet2;
    @FXML
    private TextField a33;
    @FXML
    private TextField b33;
    @FXML
    private TextField result3;
    @FXML
    private Button otvet3;
    @FXML
    private Button information;

    Integer a1,b1,c1;
    int result_field;
    @FXML
    void initialize() {


        otvet1.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a11.getText());
            b1 = Integer.valueOf(b11.getText());
            result(a1,b1,result);
        });

        otvet2.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a22.getText());
            b1 = Integer.valueOf(b22.getText());
            c1 = Integer.valueOf(c22.getText());
            result(a1,b1,c1,result2);
        });

        otvet3.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a33.getText());
            b1 = Integer.valueOf(b33.getText());
            resultButt3(a1,b1,result3);
        });
        theorymethods();
    }
    public void theorymethods(){
        information.setOnAction(event -> {
            JPanel myRootPane = new JPanel();
            JOptionPane.showMessageDialog( myRootPane, "Многочленом називають суму одночленів. Многочлен, що є сумою одночленів стандартного вигляду, серед яких немає подібних доданків, називають многочленом стандартного вигляду." , "Теорія: Многочлен", JOptionPane.DEFAULT_OPTION );

        });
    }
    public void result(int a,int b,TextField textField){
        result_field=a^2+(b*a)+b;
        textField.setText(String.valueOf(result_field));
    }
    public void result(int a,int b,int c,TextField textField){
        result_field=(a*b*c)+(a*c)+(b-(a^2));
        textField.setText(String.valueOf(result_field));
    }
    public void resultButt3(int a,int b,TextField textField){
        result_field=(a^b)+(b^a)/(a*b);
        textField.setText(String.valueOf(result_field));
    }

}
