package com.tvs;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@Fork(value = 1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class BaseBenchmark {
    private Loader loader;
    private ForeignClassLoader foreignClassLoader;

    @Setup
    public void setup() {
        loader = new Loader();
        foreignClassLoader = new ForeignClassLoader();
    }

    @Benchmark
    public int measureLoadWithSameClass() {
        return loader.load();
    }

    @Benchmark
    public int measureLoadWithForeignClass() {
        return foreignClassLoader.load();
    }
}
