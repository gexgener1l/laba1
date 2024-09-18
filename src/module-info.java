module laba1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.web;
    requires javafx.media;
    requires javafx.swing;
    requires junit;

    exports demo.parallel;
    opens tests to junit; // Разрешите доступ для JUnit к вашему пакету с тестами
}
