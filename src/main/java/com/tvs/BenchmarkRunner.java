package com.tvs;

import org.openjdk.jmh.profile.ClassloaderProfiler;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkRunner {

	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder()
				.include(BaseBenchmark.class.getSimpleName())
				.warmupIterations(10)
				.measurementIterations(10)
//				.addProfiler(ClassloaderProfiler.class)
				.forks(4)//0 makes debugging possible
				.shouldFailOnError(true)
				.build();

		new Runner(opt).run();
	}
}