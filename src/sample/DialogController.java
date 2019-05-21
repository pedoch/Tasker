package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.datamodel.ToDoData;
import sample.datamodel.ToDoItem;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescription;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker datePicker;

    public ToDoItem processData(){
        String shortDescrip = shortDescription.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadline = datePicker.getValue();
        ToDoItem newItem = new ToDoItem(shortDescrip, details, deadline);
        ToDoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
