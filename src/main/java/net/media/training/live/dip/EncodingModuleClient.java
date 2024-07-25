package net.media.training.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule fileEncodingModule = new EncodingModule(new BufferedReader(new FileReader("")), new BufferedWriter(new FileWriter("")), Base64.getEncoder());
        fileEncodingModule.encodeAndWrite();
        EncodingModule urlEncodingModule = new EncodingModule(new URLReader(new URL("")), new DatabaseWrite(new MyDatabase()), Base64.getEncoder());
        urlEncodingModule.encodeAndWrite();
    }
}
