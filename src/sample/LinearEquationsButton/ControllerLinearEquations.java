package sample.LinearEquationsButton;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;

import javax.swing.*;

public class ControllerLinearEquations  extends Menu {
    @FXML
    private TextField a11;
    @FXML
    private TextField b11;
    @FXML
    private TextField a22;
    @FXML
    private TextField b22;
    @FXML
    private TextField c22;
    @FXML
    private TextField d22;
    @FXML
    private TextField result11;
    @FXML
    private Button otvet1;
    @FXML
    private TextField result22;
    @FXML
    private Button otvet2;
    @FXML
    private Button information;

    Integer a1,b1,c1,d1;
    double result_field,result;
    @FXML
    void initialize() {
        otvet1.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a11.getText());
            b1 = Integer.valueOf(b11.getText());
            result(a1, b1, result11);
        });
        otvet2.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a22.getText());
            b1 = Integer.valueOf(b22.getText());
            c1 = Integer.valueOf(c22.getText());
            d1 = Integer.valueOf(d22.getText());
            result(a1, b1,c1,d1, result22);
        });
         theorymethods();
     }
    public void theorymethods(){
        information.setOnAction(event -> {
            JPanel myRootPane = new JPanel();
            JOptionPane.showMessageDialog( myRootPane, "Рівняння виду ах = b, де а і b - деякі числа, х - змінна, називають лінійним рівнянням з однією змінною." , "Теорія: Лінійні рівняння", JOptionPane.DEFAULT_OPTION );

        });
    }
    public void result(double a,double b,TextField textField){
        result_field=b/a;
        textField.setText(String.valueOf(result_field));
    }
    public void result(double a,double b,double c,double d,TextField textField){
        result_field=a+b-c;
        result=d/result_field;
        textField.setText(String.valueOf(result));
    }
}
