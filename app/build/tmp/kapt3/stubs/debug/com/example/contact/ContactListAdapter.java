package com.example.contact;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/contact/ContactListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/contact/ContactListAdapter$ViewHolder;", "contactList", "Ljava/util/ArrayList;", "Lcom/example/contact/datamodel/Result;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "listener", "Lcom/example/contact/ContactListAdapter$ItemOnClickListener;", "(Ljava/util/ArrayList;Landroid/content/Context;Lcom/example/contact/ContactListAdapter$ItemOnClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemOnClickListener", "ViewHolder", "app_debug"})
public final class ContactListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.contact.ContactListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.contact.datamodel.Result> contactList = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.contact.ContactListAdapter.ItemOnClickListener listener = null;
    
    public ContactListAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.contact.datamodel.Result> contactList, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.contact.ContactListAdapter.ItemOnClickListener listener) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.contact.ContactListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.contact.ContactListAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/contact/ContactListAdapter$ItemOnClickListener;", "", "itemClick", "", "position", "", "details", "", "app_debug"})
    public static abstract interface ItemOnClickListener {
        
        public abstract void itemClick(int position, boolean details);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/contact/ContactListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/contact/databinding/ContactViewBinding;", "(Lcom/example/contact/databinding/ContactViewBinding;)V", "getBinding", "()Lcom/example/contact/databinding/ContactViewBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.contact.databinding.ContactViewBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.contact.databinding.ContactViewBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.contact.databinding.ContactViewBinding getBinding() {
            return null;
        }
    }
}