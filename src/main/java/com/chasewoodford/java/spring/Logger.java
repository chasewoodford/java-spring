package com.chasewoodford.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Logger {

    private LogWriter consoleWriter;
    private LogWriter fileWriter;

    // @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Autowired
    public void setFileWriter(LogWriter fileWriter) { this.fileWriter = fileWriter; }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {

        if(consoleWriter != null)
            consoleWriter.write(text);

    }

}