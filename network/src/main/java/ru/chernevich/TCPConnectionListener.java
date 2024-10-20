package ru.chernevich;

public interface TCPConnectionListener {
    void onConnectionReady(TCPConnection tcpConnection); // запустили соединение
    void onReceiveString(TCPConnection tcpConnection, String value); //приняли строку
    void onDisconnect(TCPConnection tcpConnection); //разорвалось соединение
    void onException(TCPConnection tcpConnection, Exception e); //случилось исключение
}
