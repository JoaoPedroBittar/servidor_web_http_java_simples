package com.mycompany.servidor_web_http_java_simples1;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class principal {

    public static void main(String[] args) throws Exception {

        // Define a porta do servidor
        InetSocketAddress porta = new InetSocketAddress(8080);

        // Cria o servidor
        HttpServer server = HttpServer.create(porta, 0);

        // Cria os serviços
        server.createContext("/MensagemSimples", new MensagemSimples());

        // Liga o servidor
        server.setExecutor(null);
        server.start();

        System.out.println("Servidor web HTTP no ar:\nhttp://localhost:8080/MensagemSimples");
    }
}
