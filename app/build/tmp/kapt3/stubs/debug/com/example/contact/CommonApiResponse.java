package com.example.contact;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/contact/CommonApiResponse;", "", "onFailureResponse", "", "errorResponse", "", "requestCode", "", "onSuccessResponse", "jsonResponse", "Landroidx/lifecycle/LiveData;", "app_debug"})
public abstract interface CommonApiResponse {
    
    public abstract void onSuccessResponse(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.lang.Object> jsonResponse, int requestCode);
    
    public abstract void onFailureResponse(@org.jetbrains.annotations.NotNull
    java.lang.String errorResponse, int requestCode);
}