package ru.gorodnyuk;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Base64;
import java.util.Map;

/**
 * Извлекает запрошенные данные из JWT-токена
 */
public class JwtPayloader {

    private static final int JWT_TOKEN_SIZE = 3;
    private static final int JWT_PAYLOAD_INDEX = 1;

    private final static Base64.Decoder decoder;
    private final static ObjectMapper objectMapper;

    static {
        decoder = Base64.getUrlDecoder();
        objectMapper = new ObjectMapper();
    }

    /**
     * Парсинг JWT-токена
     *
     * @param jwtToken JWT-токен
     * @param keys     Ключи, по которым необходимо выполнить поиск в JWT-токене
     * @return Запрошенные значения по ключу и сами ключи в формате key-value (Map)
     */
    public static Map<String, Object> getPayloadMap(String jwtToken, String... keys) {

        return null;
    }
}
