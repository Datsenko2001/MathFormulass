package sample.LogarithmicEquationsButton;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;

import javax.swing.*;

public class ControllerLogarithmicEquations extends Menu {
    @FXML
    private TextField a11;
    @FXML
    private TextField b11;
    @FXML
    private TextField result1;
    @FXML
    private Button otvet1;
    @FXML
    private TextField a111;
    @FXML
    private TextField b111;
    @FXML
    private TextField c111;
    @FXML
    private TextField result11;
    @FXML
    private Button otvet11;
    @FXML
    private TextField a22;
    @FXML
    private TextField b22;
    @FXML
    private TextField c22;
    @FXML
    private TextField d22;
    @FXML
    private TextField result2;
    @FXML
    private Button otvet2;
    @FXML
    private Button information;
    Integer a1,b1,c1;
    double result_field,result;
    @FXML
    void initialize() {
        otvet1.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a11.getText());
            b1 = Integer.valueOf(b11.getText());
            result(a1, b1, result1);
        });
        otvet11.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a111.getText());
            b1 = Integer.valueOf(b111.getText());
            c1 = Integer.valueOf(c111.getText());
            result(a1, b1, c1,result11);
        });
        otvet2.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a22.getText());
            b1 = Integer.valueOf(b22.getText());
            Integer c1 = Integer.valueOf(c22.getText());
            Integer d1 = Integer.valueOf(d22.getText());
            result(a1, b1,c1,d1, result2);
        });
        theorymethods();
    }

    public void theorymethods(){
        information.setOnAction(event -> {
            JPanel myRootPane = new JPanel();
            JOptionPane.showMessageDialog( myRootPane, "Рівняння називають логарифмічним, якщо його невідомі входять лише під знаками логарифмів." , "Теорія: Логарифм", JOptionPane.DEFAULT_OPTION );

        });
    }
    public void result(int a,int b,TextField textField){
        result_field=Math.pow(a,b);
        textField.setText(String.valueOf(result_field));
    }
    public void result(int a,int b,int c,TextField textField){
        result_field=Math.pow(a,b);
        result=result_field-c;
        textField.setText(String.valueOf(result));
    }
    public void result(int a,int b,int c,int d,TextField textField){
        a=1;
        result_field=b*(c^a) -(c^a)-d;
        textField.setText(String.valueOf(result_field));
    }
}
