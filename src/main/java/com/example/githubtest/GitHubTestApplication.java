package com.example.githubtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class GitHubTestApplication
{

    public static void main(String[] args)
    {
        Integer prime = 1;
        SoftReference<Integer> soft = new SoftReference<Integer>(prime);
//        Map<Integer, String> map = new HashMap<>();
//        SpringApplication.run(GitHubTestApplication.class, args);
    }

}
