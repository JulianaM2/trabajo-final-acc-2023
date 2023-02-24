package co.com.falabella.pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPrincipalPage {
    public static final Target OPC_TECNOLOGIA = Target.the("Tarjeta de tecnología")
            .locatedBy("//div[@id='main-CollapsedCards-5d56c543-e8cd-4fdb-a5ac-80e8bca75916-desktop-card-0']/a");
    public static final Target CARD_TECNOLOGIA = Target.the("Id tarjeta de la opción Tecnología")
            .located(By.id("main-CollapsedCards-5d56c543-e8cd-4fdb-a5ac-80e8bca75916-desktop-card-0"));
    public static final Target IN_BARRA_BUSQUEDA = Target.the("Opción de celular xiaomi")
            .locatedBy("//input[@id='testId-SearchBar-Input']");
}
