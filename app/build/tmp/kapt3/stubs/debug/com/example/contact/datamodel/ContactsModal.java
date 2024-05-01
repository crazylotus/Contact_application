package com.example.contact.datamodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/contact/datamodel/ContactsModal;", "Ljava/io/Serializable;", "()V", "contactId", "", "getContactId", "()Ljava/lang/String;", "setContactId", "(Ljava/lang/String;)V", "contactNumber", "getContactNumber", "setContactNumber", "email", "getEmail", "setEmail", "image", "getImage", "setImage", "userName", "getUserName", "setUserName", "app_debug"})
public final class ContactsModal implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "user_name")
    @org.jetbrains.annotations.Nullable
    private java.lang.String userName;
    @com.google.gson.annotations.SerializedName(value = "contact_id")
    @org.jetbrains.annotations.Nullable
    private java.lang.String contactId;
    @com.google.gson.annotations.SerializedName(value = "contact_number")
    @org.jetbrains.annotations.Nullable
    private java.lang.String contactNumber;
    @com.google.gson.annotations.SerializedName(value = "email")
    @org.jetbrains.annotations.NotNull
    private java.lang.String email = "";
    @com.google.gson.annotations.SerializedName(value = "image")
    @org.jetbrains.annotations.Nullable
    private java.lang.String image;
    
    public ContactsModal() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getContactId() {
        return null;
    }
    
    public final void setContactId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getContactNumber() {
        return null;
    }
    
    public final void setContactNumber(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}