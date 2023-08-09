package com.plcoding.bluetoothchat.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u00a2\u0006\u0002\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00c6\u0003JY\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\nH\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/plcoding/bluetoothchat/presentation/BluetoothUiState;", "", "scannedDevices", "", "Lcom/plcoding/bluetoothchat/domain/chat/BluetoothDevice;", "pairedDevices", "isConnected", "", "isConnecting", "errorMessage", "", "messages", "Lcom/plcoding/bluetoothchat/domain/chat/BluetoothMessage;", "(Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/util/List;)V", "getErrorMessage", "()Ljava/lang/String;", "()Z", "getMessages", "()Ljava/util/List;", "getPairedDevices", "getScannedDevices", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class BluetoothUiState {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> scannedDevices = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> pairedDevices = null;
    private final boolean isConnected = false;
    private final boolean isConnecting = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String errorMessage = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothMessage> messages = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.plcoding.bluetoothchat.presentation.BluetoothUiState copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> scannedDevices, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> pairedDevices, boolean isConnected, boolean isConnecting, @org.jetbrains.annotations.Nullable
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothMessage> messages) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public BluetoothUiState() {
        super();
    }
    
    public BluetoothUiState(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> scannedDevices, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> pairedDevices, boolean isConnected, boolean isConnecting, @org.jetbrains.annotations.Nullable
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothMessage> messages) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> getScannedDevices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> getPairedDevices() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isConnecting() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothMessage> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothMessage> getMessages() {
        return null;
    }
}