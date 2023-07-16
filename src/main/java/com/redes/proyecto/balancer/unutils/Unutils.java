package com.redes.proyecto.balancer.unutils;

public class Unutils {


    public static Long sum(long n){
        long startTime = System.currentTimeMillis();
        long sum = 0;

        for (long j = 0; j < n; j++) {

            for (long i = 0; sum < 1000000000 -2 ; i++) {
                sum += 1;
            }

            sum  = 0    ;
        }

        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
}
