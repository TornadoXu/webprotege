package edu.stanford.bmir.protege.web.client.irigen.uuid;

import com.google.common.base.Optional;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasText;
import edu.stanford.bmir.protege.web.shared.DirtyChangedHandler;
import edu.stanford.bmir.protege.web.shared.crud.EntityCrudKitSuffixSettingsEditor;
import edu.stanford.bmir.protege.web.shared.crud.UUIDSuffixSettings;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 30/07/2013
 */
public class UUIDSuffixSettingsEditor extends Composite implements EntityCrudKitSuffixSettingsEditor<UUIDSuffixSettings> {

    interface UUIDSuffixSettingsEditorUiBinder extends UiBinder<HTMLPanel, UUIDSuffixSettingsEditor> {

    }

    private static UUIDSuffixSettingsEditorUiBinder ourUiBinder = GWT.create(UUIDSuffixSettingsEditorUiBinder.class);

//    @UiField
//    protected HasText labelLangEditor;

    public UUIDSuffixSettingsEditor() {
        HTMLPanel rootElement = ourUiBinder.createAndBindUi(this);
        initWidget(rootElement);
    }

    @Override
    public boolean isWellFormed() {
        return false;
    }

    @Override
    public void setValue(UUIDSuffixSettings object) {

    }

    @Override
    public void clearValue() {

    }

    @Override
    public Optional<UUIDSuffixSettings> getValue() {
        return Optional.of(new UUIDSuffixSettings());
    }

    @Override
    public boolean isDirty() {
        return false;
    }

    @Override
    public HandlerRegistration addDirtyChangedHandler(DirtyChangedHandler handler) {
        return null;
    }

    @Override
    public HandlerRegistration addValueChangeHandler(ValueChangeHandler<Optional<UUIDSuffixSettings>> handler) {
        return null;
    }


}