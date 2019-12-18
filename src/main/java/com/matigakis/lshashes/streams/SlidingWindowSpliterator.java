package com.matigakis.lshashes.streams;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Queue;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SlidingWindowSpliterator<T> implements Spliterator<List<T>> {
    private Collection<T> source;
    private int windowSize;
    private Iterator<T> iterator;
    private Queue<T> buffer;

    public SlidingWindowSpliterator(Collection<T> source, int windowSize) {
        this.source = source;
        this.windowSize = windowSize;

        iterator = Objects.requireNonNull(source).iterator();
        buffer = new ArrayDeque<T>(windowSize);
    }

    public static <T> Stream<List<T>> windowed(Collection<T> stream, int windowSize) {
        return StreamSupport.stream(new SlidingWindowSpliterator<>(stream, windowSize), false);
    }

    @Override
    public boolean tryAdvance(Consumer<? super List<T>> consumer) {
        if (windowSize < 1) {
            return false;
        }

        while (iterator.hasNext()) {
            buffer.add(iterator.next());
            if (buffer.size() == windowSize) {

                ArrayList<T> t = new ArrayList<T>();
                for (Object item: buffer.toArray()) {
                    t.add((T) item);
                }
                consumer.accept(t);
                buffer.poll();

                return iterator.hasNext();
            }
        }

        return false;
    }

    @Override
    public Spliterator<List<T>> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        if (source.size() < windowSize){
            return 0;
        }

        return source.size() - windowSize + 1;
    }

    @Override
    public int characteristics() {
        return Spliterator.ORDERED | Spliterator.SIZED | Spliterator.NONNULL;
    }
}
