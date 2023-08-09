package com.plcoding.bluetoothchat.presentation.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001aN\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a8\u0006\u0012"}, d2 = {"BluetoothDeviceList", "", "pairedDevices", "", "Lcom/plcoding/bluetoothchat/domain/chat/BluetoothDevice;", "scannedDevices", "onClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "DeviceScreen", "state", "Lcom/plcoding/bluetoothchat/presentation/BluetoothUiState;", "onStartScan", "Lkotlin/Function0;", "onStopScan", "onStartServer", "onDeviceClick", "app_debug"})
public final class DeviceScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void DeviceScreen(@org.jetbrains.annotations.NotNull
    com.plcoding.bluetoothchat.presentation.BluetoothUiState state, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onStartScan, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onStopScan, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onStartServer, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.bluetoothchat.domain.chat.BluetoothDevice, kotlin.Unit> onDeviceClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void BluetoothDeviceList(@org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> pairedDevices, @org.jetbrains.annotations.NotNull
    java.util.List<com.plcoding.bluetoothchat.domain.chat.BluetoothDevice> scannedDevices, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.plcoding.bluetoothchat.domain.chat.BluetoothDevice, kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
}