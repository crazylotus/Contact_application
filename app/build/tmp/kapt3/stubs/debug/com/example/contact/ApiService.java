package com.example.contact;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/contact/ApiService;", "", "getContactList", "Lretrofit2/Response;", "results", "", "inc", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ApiService {
    @org.jetbrains.annotations.NotNull
    public static final com.example.contact.ApiService.Companion Companion = null;
    
    @retrofit2.http.GET(value = "api/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getContactList(@retrofit2.http.Query(value = "results")
    int results, @retrofit2.http.Query(value = "inc")
    @org.jetbrains.annotations.NotNull
    java.lang.String inc, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.Object>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/example/contact/ApiService$Companion;", "", "()V", "apiSerive", "Lcom/example/contact/ApiService;", "getApiSerive", "()Lcom/example/contact/ApiService;", "setApiSerive", "(Lcom/example/contact/ApiService;)V", "getInstance", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.Nullable
        private static com.example.contact.ApiService apiSerive;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.contact.ApiService getApiSerive() {
            return null;
        }
        
        public final void setApiSerive(@org.jetbrains.annotations.Nullable
        com.example.contact.ApiService p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.contact.ApiService getInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}