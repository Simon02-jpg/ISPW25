module com.app.ispw2025 {
    requires javafx.controls;
    requires javafx.fxml;
    requires log4j.api;
    requires java.sql;


    opens com.app.ispw2025 to javafx.fxml;
    exports com.app.ispw2025;
    exports com.app.ispw2025.util;
    opens com.app.ispw2025.util to javafx.fxml;
    exports com.app.ispw2025.allertbox;
    opens com.app.ispw2025.allertbox to javafx.fxml;
}