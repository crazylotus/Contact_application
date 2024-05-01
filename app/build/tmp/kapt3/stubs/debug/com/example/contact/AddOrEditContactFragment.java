package com.example.contact;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ&\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u001a\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006%"}, d2 = {"Lcom/example/contact/AddOrEditContactFragment;", "Lcom/example/contact/BindingFragment;", "Lcom/example/contact/databinding/FragmentAddOrEditContactBinding;", "()V", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "Landroidx/viewbinding/ViewBinding;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "data", "Lcom/example/contact/datamodel/ContactsModal;", "getData", "()Lcom/example/contact/datamodel/ContactsModal;", "setData", "(Lcom/example/contact/datamodel/ContactsModal;)V", "edit", "", "getEdit", "()Z", "setEdit", "(Z)V", "addContact", "", "context", "Landroid/content/Context;", "name", "", "phoneNumber", "editContact", "contactId", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class AddOrEditContactFragment extends com.example.contact.BindingFragment<com.example.contact.databinding.FragmentAddOrEditContactBinding> {
    private boolean edit = false;
    public com.example.contact.datamodel.ContactsModal data;
    
    public AddOrEditContactFragment() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected kotlin.jvm.functions.Function1<android.view.LayoutInflater, androidx.viewbinding.ViewBinding> getBindingInflater() {
        return null;
    }
    
    public final boolean getEdit() {
        return false;
    }
    
    public final void setEdit(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.contact.datamodel.ContactsModal getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    com.example.contact.datamodel.ContactsModal p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void editContact(@org.jetbrains.annotations.NotNull
    android.content.Context context, long contactId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber) {
    }
    
    public final void addContact(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber) {
    }
}