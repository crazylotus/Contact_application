package com.example.contact;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0011J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u001a\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0011H\u0002R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"Lcom/example/contact/ContactDetailsFragment;", "Lcom/example/contact/BindingFragment;", "Lcom/example/contact/databinding/FragmentContactDetailsBinding;", "()V", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "Landroidx/viewbinding/ViewBinding;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "editData", "Lcom/example/contact/datamodel/ContactsModal;", "getEditData", "()Lcom/example/contact/datamodel/ContactsModal;", "setEditData", "(Lcom/example/contact/datamodel/ContactsModal;)V", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "random", "", "getRandom", "()Z", "setRandom", "(Z)V", "getRandomColor", "", "isValidName", "name", "makeCall", "", "contactNumber", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "sendMessage", "TextDrawable", "app_debug"})
public final class ContactDetailsFragment extends com.example.contact.BindingFragment<com.example.contact.databinding.FragmentContactDetailsBinding> {
    private boolean random = true;
    @org.jetbrains.annotations.NotNull
    private java.lang.String phoneNumber = "";
    public com.example.contact.datamodel.ContactsModal editData;
    
    public ContactDetailsFragment() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected kotlin.jvm.functions.Function1<android.view.LayoutInflater, androidx.viewbinding.ViewBinding> getBindingInflater() {
        return null;
    }
    
    public final boolean getRandom() {
        return false;
    }
    
    public final void setRandom(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.contact.datamodel.ContactsModal getEditData() {
        return null;
    }
    
    public final void setEditData(@org.jetbrains.annotations.NotNull
    com.example.contact.datamodel.ContactsModal p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void sendMessage(java.lang.String contactNumber) {
    }
    
    private final void makeCall(java.lang.String contactNumber) {
    }
    
    private final int getRandomColor() {
        return 0;
    }
    
    public final boolean isValidName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/contact/ContactDetailsFragment$TextDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "text", "", "(Lcom/example/contact/ContactDetailsFragment;Landroid/content/Context;Ljava/lang/String;)V", "paint", "Landroid/graphics/Paint;", "textBounds", "Landroid/graphics/Rect;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "app_debug"})
    public final class TextDrawable extends android.graphics.drawable.Drawable {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String text = null;
        @org.jetbrains.annotations.NotNull
        private final android.graphics.Paint paint = null;
        @org.jetbrains.annotations.NotNull
        private final android.graphics.Rect textBounds = null;
        
        public TextDrawable(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String text) {
            super();
        }
        
        @java.lang.Override
        public void draw(@org.jetbrains.annotations.NotNull
        android.graphics.Canvas canvas) {
        }
        
        @java.lang.Override
        public void setAlpha(int alpha) {
        }
        
        @java.lang.Override
        public void setColorFilter(@org.jetbrains.annotations.Nullable
        android.graphics.ColorFilter colorFilter) {
        }
        
        @java.lang.Override
        public int getOpacity() {
            return 0;
        }
    }
}