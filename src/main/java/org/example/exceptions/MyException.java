/**
 * Exceção personalizada para demonstrar o uso de exceções em Java.
 * Esta classe estende a classe Exception (verificada) e permite criar exceções com mensagens personalizadas.
 *
 * @author leonardosilva
 * @version 1.0
 * @since 2024-06-15
 */
package org.example.exceptions;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
