package com.github.jonathangunawanstd;

public class Main {
    public static void main(String[] args) {
        plugins {
    id 'java'
}

group 'com.github.jonathangunawanstd'
version '1.0-SNAPSHOT'

            compileJava.options.encoding = 'UTF-8’

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.1'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
}

test {
    useJUnitPlatform()
}
    }
}
