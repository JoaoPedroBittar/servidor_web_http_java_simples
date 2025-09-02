package com.mycompany.servidor_web_http_java_simples1;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

public class MensagemSimples implements HttpHandler {

    @Override
    public void handle(HttpExchange request) throws IOException {

        String resposta = "<b>Servidor HTTP</b> Simples";

        request.sendResponseHeaders(200, resposta.getBytes().length);
        try (OutputStream corpo = request.getResponseBody()) {
            corpo.write(resposta.getBytes());
        }
    }
}
