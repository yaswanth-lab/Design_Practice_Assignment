package net.media.training.live.dip;

import java.io.IOException;
import java.io.Writer;

public class DatabaseWrite extends Writer {
    private Database database;

    public DatabaseWrite(Database database) {
        this.database = database;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}