package com.javarush.test.level19.lesson10.bonus02;

/* Свой FileWriter
Реализовать логику FileConsoleWriter
Должен наследоваться от FileWriter
При записи данных в файл, должен дублировать эти данные на консоль
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter extends FileWriter{

    public FileConsoleWriter(String fileName) throws IOException
    {
        super(fileName);
        System.out.println(fileName.toString());
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException
    {
        super(fileName, append);
        System.out.println(fileName.toString());
    }

    public FileConsoleWriter(File file) throws IOException
    {
        super(file);
        System.out.println(file.toString());
    }

    public FileConsoleWriter(File file, boolean append) throws IOException
    {
        super(file, append);
        System.out.println(file.toString());
    }

    public FileConsoleWriter(FileDescriptor fd)
    {
        super(fd);
        fd.toString();
    }
}
