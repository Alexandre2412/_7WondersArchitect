module com.example._7wondersarchitect {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example._7wondersarchitect to javafx.fxml;
    exports com.example._7wondersarchitect;
    exports com.example._7wondersarchitect.Wonders;
    opens com.example._7wondersarchitect.Wonders to javafx.fxml;
    exports com.example._7wondersarchitect.Cards;
    opens com.example._7wondersarchitect.Cards to javafx.fxml;
}