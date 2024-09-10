package com.banjohann;

import com.banjohann.tsid.Tsid;
import com.banjohann.tsid.TsidCreator;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            Tsid id = TsidCreator.getTsid256();

            System.out.println("ID em formato String: " + id.toString());
            System.out.println("ID em formato Long: " + id.toLong());
            return;
        }

        var command = args[0];
        if ("from".equals(command)) {
            if (args.length < 2) {
                System.err.println("Usage: java TsidConverter <arguments>");
                System.exit(1);
            }

            handleFrom(args[1]);
        }
    }

    private static void handleFrom(String value) {
        Tsid id = null;
        try {
            id = Tsid.from(longId);
        } catch (NumberFormatException e){
            id = Tsid.from(value);
        }

        System.out.println("ID em formato String: " + id.toString());
        System.out.println("ID em formato Long: " + id.toLong());
    }
}
