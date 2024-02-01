package com.hanxun.ioc_01;

public class ClinetService {

    private static ClinetService clinetService = new ClinetService();

    private ClinetService() {

    }

    public static ClinetService getInstance() {
        return clinetService;
    }
}



