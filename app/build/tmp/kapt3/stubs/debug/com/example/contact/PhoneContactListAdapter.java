package com.example.contact;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u001b\u001c\u001dB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/contact/PhoneContactListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/contact/PhoneContactListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "contactsModalArrayList", "Ljava/util/ArrayList;", "Lcom/example/contact/datamodel/ContactsModal;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/example/contact/PhoneContactListAdapter$ItemOnClickListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/example/contact/PhoneContactListAdapter$ItemOnClickListener;)V", "getItemCount", "", "getRandomColor", "isValidName", "", "name", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemOnClickListener", "TextDrawable", "ViewHolder", "app_debug"})
public final class PhoneContactListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.contact.PhoneContactListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.contact.PhoneContactListAdapter.ItemOnClickListener listener = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.example.contact.datamodel.ContactsModal> contactsModalArrayList;
    
    public PhoneContactListAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.contact.datamodel.ContactsModal> contactsModalArrayList, @org.jetbrains.annotations.NotNull
    com.example.contact.PhoneContactListAdapter.ItemOnClickListener listener) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.contact.PhoneContactListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.contact.PhoneContactListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    private final int getRandomColor() {
        return 0;
    }
    
    private final boolean isValidName(java.lang.String name) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/contact/PhoneContactListAdapter$ItemOnClickListener;", "", "itemClick", "", "position", "", "details", "", "app_debug"})
    public static abstract interface ItemOnClickListener {
        
        public abstract void itemClick(int position, boolean details);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/contact/PhoneContactListAdapter$TextDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "text", "", "(Lcom/example/contact/PhoneContactListAdapter;Landroid/content/Context;Ljava/lang/String;)V", "paint", "Landroid/graphics/Paint;", "textBounds", "Landroid/graphics/Rect;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/contact/PhoneContactListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/contact/PhoneContactListAdapter;Landroid/view/View;)V", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "contactIV", "Landroid/widget/ImageView;", "getContactIV", "()Landroid/widget/ImageView;", "contactTV", "Landroid/widget/TextView;", "getContactTV", "()Landroid/widget/TextView;", "detailsLayout", "Landroid/widget/LinearLayout;", "getDetailsLayout", "()Landroid/widget/LinearLayout;", "image", "getImage", "ivCall", "getIvCall", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView contactIV = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView contactTV = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView image = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView ivCall = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.cardview.widget.CardView cardView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.LinearLayout detailsLayout = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getContactIV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getContactTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getIvCall() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.cardview.widget.CardView getCardView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.LinearLayout getDetailsLayout() {
            return null;
        }
    }
}