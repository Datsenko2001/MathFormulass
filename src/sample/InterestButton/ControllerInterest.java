package sample.InterestButton;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class ControllerInterest {
    @FXML
    private TextField a11;
    @FXML
    private TextField result;
    @FXML
    private Button otvet1;
    @FXML
    private TextField a22;
    @FXML
    private TextField b22;
    @FXML
    private TextField result2;
    @FXML
    private Button otvet2;
    @FXML
    private Button information;
    Integer a1,b1,c1;
    int result_field;
    double result_field_double;

    @FXML
    void initialize() {
        otvet1.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a11.getText());
            result(a1, result);
        });
        otvet2.setOnAction(actionEvent -> {
            a1 = Integer.valueOf(a22.getText());
            b1 = Integer.valueOf(b22.getText());
            result(a1,b1, result2);
        });
        theorymethods();
    }
    public void theorymethods(){
        information.setOnAction(event -> {
            JPanel myRootPane = new JPanel();
            JOptionPane.showMessageDialog( myRootPane, "Відсоток (або процент) — це одна сота частини, тобто 1% = 0,01 = 1/100. Можна записати: 5% = 0,05; 20% = 0,2; 100% = 1; 130% = 1,3 тощо." , "Теорія: Відсотки", JOptionPane.DEFAULT_OPTION );

        });
    }
    public void result(int a,TextField textField){
        result_field=a;
        textField.setText(String.valueOf("0,"+result_field));
    }
    public void result(double a,double b,TextField textField){
        result_field_double=(100*b)/a;
        textField.setText(String.valueOf(result_field_double));
    }
}
