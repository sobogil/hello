package org.example.hello;

import java.io.UnsupportedEncodingException;

public interface IEncoder {
    public String encode(String message) throws UnsupportedEncodingException;
}
