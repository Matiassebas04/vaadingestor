package com.example.application.views.cliente;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Cliente")
@Route(value = "Cliente", layout = MainLayout.class)
@Uses(Icon.class)
public class ClienteView extends Composite<VerticalLayout> {

    public ClienteView() {
        H1 h1 = new H1();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        H1 h12 = new H1();
        HorizontalLayout layoutRow = new HorizontalLayout();
        TextField textField3 = new TextField();
        Select select = new Select();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        TimePicker timePicker = new TimePicker();
        TimePicker timePicker2 = new TimePicker();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("Datos Cliente");
        h1.setWidth("max-content");
        formLayout2Col.setWidth("100%");
        textField.setLabel("Nombre y Apellido");
        textField.setWidth("600px");
        textField2.setLabel("Cedula");
        textField2.setWidth("600px");
        h12.setText("Datos Vehículo");
        h12.setWidth("max-content");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.XSMALL);
        layoutRow.addClassName(Padding.SMALL);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.START);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        textField3.setLabel("Placa");
        layoutRow.setAlignSelf(FlexComponent.Alignment.START, textField3);
        textField3.setWidth("600px");
        select.setLabel("Tipo");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, select);
        select.setWidth("600px");
        setSelectSampleData(select);
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        timePicker.setLabel("Hora de entrada");
        timePicker.setWidth("600px");
        timePicker.setHeight("100px");
        timePicker2.setLabel("Hora de salida");
        timePicker2.setWidth("600px");
        timePicker2.setHeight("100px");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Guardar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancelar");
        buttonSecondary.setWidth("100px");
        getContent().add(h1);
        getContent().add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        getContent().add(h12);
        getContent().add(layoutRow);
        layoutRow.add(textField3);
        getContent().add(select);
        getContent().add(layoutRow2);
        layoutRow2.add(timePicker);
        layoutRow2.add(timePicker2);
        getContent().add(layoutRow3);
        layoutRow3.add(buttonPrimary);
        layoutRow3.add(buttonSecondary);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setSelectSampleData(Select select) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        select.setItems(sampleItems);
        select.setItemLabelGenerator(item -> ((SampleItem) item).label());
        select.setItemEnabledProvider(item -> !Boolean.TRUE.equals(((SampleItem) item).disabled()));
    }
}
