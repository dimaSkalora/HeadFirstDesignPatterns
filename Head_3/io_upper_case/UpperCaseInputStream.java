package io_upper_case;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

//Начнем с расширения FilterInputStream - абстрактного декоратора для всех обьектов InputStream
public class UpperCaseInputStream extends FilterInputStream{

    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }

    //Переобразуем каждый символ верхнего регистра к нижнему регистру
    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toUpperCase((char)c));
    }

    //Переобразуем каждый символ верхнего регистра к нижнему регистру
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off+result; i++) {
            b[i] = (byte)Character.toUpperCase((char)b[i]);
        }
        return result;
    }
}
