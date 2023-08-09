package com.plcoding.bluetoothchat.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\b\u0010\u0014\u001a\u00020\u000fH\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u000fJ\u0012\u0010\u001b\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/plcoding/bluetoothchat/presentation/BluetoothViewModel;", "Landroidx/lifecycle/ViewModel;", "bluetoothController", "Lcom/plcoding/bluetoothchat/domain/chat/BluetoothController;", "(Lcom/plcoding/bluetoothchat/domain/chat/BluetoothController;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/plcoding/bluetoothchat/presentation/BluetoothUiState;", "deviceConnectionJob", "Lkotlinx/coroutines/Job;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "connectToDevice", "", "device", "Lcom/plcoding/bluetoothchat/domain/chat/BluetoothDevice;", "Lcom/plcoding/bluetoothchat/domain/chat/BluetoothDeviceDomain;", "disconnectFromDevice", "onCleared", "sendMessage", "message", "", "startScan", "stopScan", "waitForIncomingConnections", "listen", "Lkotlinx/coroutines/flow/Flow;", "Lcom/plcoding/bluetoothchat/domain/chat/ConnectionResult;", "app_debug"})
public final class BluetoothViewModel extends androidx.lifecycle.ViewModel {
    private final com.plcoding.bluetoothchat.domain.chat.BluetoothController bluetoothController = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.plcoding.bluetoothchat.presentation.BluetoothUiState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.plcoding.bluetoothchat.presentation.BluetoothUiState> state = null;
    private kotlinx.coroutines.Job deviceConnectionJob;
    
    @javax.inject.Inject
    public BluetoothViewModel(@org.jetbrains.annotations.NotNull
    com.plcoding.bluetoothchat.domain.chat.BluetoothController bluetoothController) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.plcoding.bluetoothchat.presentation.BluetoothUiState> getState() {
        return null;
    }
    
    public final void connectToDevice(@org.jetbrains.annotations.NotNull
    com.plcoding.bluetoothchat.domain.chat.BluetoothDevice device) {
    }
    
    public final void disconnectFromDevice() {
    }
    
    public final void waitForIncomingConnections() {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public final void startScan() {
    }
    
    public final void stopScan() {
    }
    
    private final kotlinx.coroutines.Job listen(kotlinx.coroutines.flow.Flow<? extends com.plcoding.bluetoothchat.domain.chat.ConnectionResult> $this$listen) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}