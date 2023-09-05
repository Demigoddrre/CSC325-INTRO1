module edu.farmingdale.csc325intro1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc325intro1 to javafx.fxml;
    exports edu.farmingdale.csc325intro1;
}