package io_lower_case;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

//Начнем с расширения FilterInputStream - абстрактного декоратора для всех обьектов InputStream
public class LowerCaseInputStream extends FilterInputStream{

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    //Переобразуем каждый символ верхнего регистра к нижнему регистру
    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    //Переобразуем каждый символ верхнего регистра к нижнему регистру
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
