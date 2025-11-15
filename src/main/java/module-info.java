module com.example.dsaprojectfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dsaprojectfx to javafx.fxml;
    exports com.project.ecommerce;
}