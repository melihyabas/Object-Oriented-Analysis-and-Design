import java.util.*;

import java.io.*;
import java.io.File;

import java.util.Scanner;

/**
 * Main class to test the project
 */
public class Main {

    /**
     * @param args Commandline arguments
     * @throws Exception Exception
     */
    public static void main(String[] args) throws Exception
    {

        TemplateTransform obj1 = new DCT(args[0]);
        TemplateTransform obj2 = new DFT(args[0]);
    
        obj1.calculation();
        obj2.calculation();
    }
}
