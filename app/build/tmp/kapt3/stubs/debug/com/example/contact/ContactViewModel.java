package com.example.contact;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u0011H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010(\u00a8\u00061"}, d2 = {"Lcom/example/contact/ContactViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiService", "Lcom/example/contact/ApiService;", "getApiService", "()Lcom/example/contact/ApiService;", "setApiService", "(Lcom/example/contact/ApiService;)V", "commonInterface", "Lcom/example/contact/CommonApiResponse;", "getCommonInterface", "()Lcom/example/contact/CommonApiResponse;", "setCommonInterface", "(Lcom/example/contact/CommonApiResponse;)V", "errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "liveDataResponse", "", "loading", "", "getLoading", "repository", "Lcom/example/contact/ContactRepository;", "responseData", "getResponseData", "setResponseData", "(Landroidx/lifecycle/MutableLiveData;)V", "apiRequest", "", "requestCode", "", "context", "Landroid/content/Context;", "onError", "message", "app_debug"})
public final class ContactViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Object> responseData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Object> liveDataResponse;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessage = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.contact.ContactRepository repository = null;
    public com.example.contact.ApiService apiService;
    @org.jetbrains.annotations.Nullable
    private com.example.contact.CommonApiResponse commonInterface;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job job;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    
    public ContactViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Object> getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.contact.ApiService getApiService() {
        return null;
    }
    
    public final void setApiService(@org.jetbrains.annotations.NotNull
    com.example.contact.ApiService p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.contact.CommonApiResponse getCommonInterface() {
        return null;
    }
    
    public final void setCommonInterface(@org.jetbrains.annotations.Nullable
    com.example.contact.CommonApiResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineExceptionHandler getExceptionHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    private final void onError(java.lang.String message) {
    }
    
    public final void apiRequest(int requestCode, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}