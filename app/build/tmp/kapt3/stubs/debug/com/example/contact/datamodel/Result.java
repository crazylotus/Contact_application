package com.example.contact.datamodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"Lcom/example/contact/datamodel/Result;", "Ljava/io/Serializable;", "()V", "cell", "", "getCell", "()Ljava/lang/String;", "email", "getEmail", "gender", "getGender", "id", "Lcom/example/contact/datamodel/Id;", "getId", "()Lcom/example/contact/datamodel/Id;", "setId", "(Lcom/example/contact/datamodel/Id;)V", "load", "", "getLoad", "()Z", "name", "Lcom/example/contact/datamodel/Name;", "getName", "()Lcom/example/contact/datamodel/Name;", "setName", "(Lcom/example/contact/datamodel/Name;)V", "phone", "getPhone", "picture", "Lcom/example/contact/datamodel/Picture;", "getPicture", "()Lcom/example/contact/datamodel/Picture;", "setPicture", "(Lcom/example/contact/datamodel/Picture;)V", "app_debug"})
public final class Result implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "cell")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String cell = "";
    @com.google.gson.annotations.SerializedName(value = "email")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = "";
    @com.google.gson.annotations.SerializedName(value = "gender")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gender = "";
    @com.google.gson.annotations.SerializedName(value = "id")
    public com.example.contact.datamodel.Id id;
    @com.google.gson.annotations.SerializedName(value = "name")
    public com.example.contact.datamodel.Name name;
    @com.google.gson.annotations.SerializedName(value = "phone")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phone = "";
    @com.google.gson.annotations.SerializedName(value = "picture")
    public com.example.contact.datamodel.Picture picture;
    @com.google.gson.annotations.SerializedName(value = "load")
    private final boolean load = false;
    
    public Result() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCell() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.contact.datamodel.Id getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    com.example.contact.datamodel.Id p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.contact.datamodel.Name getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    com.example.contact.datamodel.Name p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.contact.datamodel.Picture getPicture() {
        return null;
    }
    
    public final void setPicture(@org.jetbrains.annotations.NotNull
    com.example.contact.datamodel.Picture p0) {
    }
    
    public final boolean getLoad() {
        return false;
    }
}