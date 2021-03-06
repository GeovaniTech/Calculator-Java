import java.util.Arrays;
import groovy.util.Eval;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class InterfaceController {
    static int n = 0;
    public static String verifications(String text, int number) {
        String[] operators = {"/", "*", "-", "+", "%"};

        if (n == 0) {
            n += 1;
            return "" + number;
        }

        String lastCharacter = text.substring(text.length() - 1);

        int pos = Arrays.binarySearch(operators, lastCharacter);

        if (pos > 0) {
            return "" + text + number;
        }
        else {
            return "" + text + number;
        }
        
    }

    public static String verficationsOperators(String CurrentText, String operator) {
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String lastCharacter = CurrentText.substring(CurrentText.length() - 1);

        int pos = Arrays.binarySearch(numbers, lastCharacter);
        System.out.println(pos);



        if (pos >= 0) {
            return CurrentText + operator;
        }

        else {
            return CurrentText;
        }
    }


    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDiminuir;

    @FXML
    private Button btnDivisao;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnResto;

    @FXML
    private Button btnSomar;

    @FXML
    private Button btnVirgula;

    @FXML
    private Text txtResult;

    @FXML
    void click0(ActionEvent event) {
        String text = txtResult.getText();

        String verification = verifications(text, 0);

        txtResult.setText("" + verification);
        
    }

    @FXML
    void click1(ActionEvent event) {
        String text = txtResult.getText();

        String verification = verifications(text, 1);

        txtResult.setText("" + verification);
    }

    @FXML
    void click2(ActionEvent event) {
        String text = txtResult.getText();
        
        String verification = verifications(text, 2);

        txtResult.setText("" + verification);
    }

    @FXML
    void click3(ActionEvent event) {
        String text = txtResult.getText();
        
        String verification = verifications(text, 3);

        txtResult.setText("" + verification);
    }

    @FXML
    void click4(ActionEvent event) {
        String text = txtResult.getText();
        
        String verification = verifications(text, 4);

        txtResult.setText("" + verification); 
    }

    @FXML
    void click5(ActionEvent event) {
        String text = txtResult.getText();

        String verification = verifications(text, 5);

        txtResult.setText("" + verification); 
    }

    @FXML
    void click6(ActionEvent event) {
        String text = txtResult.getText();

        String verification = verifications(text, 6);

        txtResult.setText("" + verification); 
    }

    @FXML
    void click7(ActionEvent event) {
        String text = txtResult.getText();

        String verification = verifications(text, 7);

        txtResult.setText("" + verification); 
    }

    @FXML
    void click8(ActionEvent event) {
        String text = txtResult.getText();

        String verification = verifications(text, 8);

        txtResult.setText("" + verification); 
    }

    @FXML
    void click9(ActionEvent event) {
        String text = txtResult.getText();

        String verification = verifications(text, 9);

        txtResult.setText("" + verification); 
    }

    @FXML
    void clickBack(ActionEvent event) {
        String text = txtResult.getText();

        if (text.length() == 1) {
            txtResult.setText("0");
            n = 0;
        }
        else {
            txtResult.setText(text.substring(0, text.length() - 1));
        }
    }

    @FXML
    void clickClear(ActionEvent event) {
        txtResult.setText("0");
        n = 0;
    }

    @FXML
    void clickDivi(ActionEvent event) {
        String text = txtResult.getText();

        txtResult.setText(verficationsOperators(text, "/"));
    }
        
    @FXML
    void clickIgual(ActionEvent event) {
        String text = txtResult.getText();

        try {
            txtResult.setText("" + Eval.me(text));
        } catch (Exception e) {
            txtResult.setText(text);
        }
    }

    @FXML
    void clickMult(ActionEvent event) {
        String text = txtResult.getText();

        txtResult.setText(verficationsOperators(text, "*"));

    }

    @FXML
    void clickResto(ActionEvent event) {
        String text = txtResult.getText();
        
        txtResult.setText(verficationsOperators(text, "%"));

    }

    @FXML
    void clickSoma(ActionEvent event) {
        String text = txtResult.getText();
        
        txtResult.setText(verficationsOperators(text, "+"));

    }

    @FXML
    void clickSub(ActionEvent event) {
        String text = txtResult.getText();
        
        txtResult.setText(verficationsOperators(text, "-"));

    }

    @FXML
    void clickVirgula(ActionEvent event) {
        String text = txtResult.getText();

        String lastCharacter = text.substring(text.length() - 1);

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int pos = Arrays.binarySearch(numbers, lastCharacter);
        
        if (pos >= 0) {
            txtResult.setText(text + ".");
        }

    }

}
