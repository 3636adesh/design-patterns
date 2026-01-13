package com.example.choreography;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FieldDefaults(level = AccessLevel.PACKAGE)
public class Saga {

    final List<Chapter> chapters;
    int pos;
    boolean forward;
    boolean finished;

    private Saga() {
        this.chapters = new ArrayList<>();
        this.pos = 0;
        this.forward = true;
        this.finished = false;
    }

    public static Saga create(){
        return new Saga();
    }

    /**
     * get result of saga.
     *
     * @return result of saga @see {@link SagaResult}
     */
    public SagaResult getResult() {
        if (finished) {
            return forward
                    ? SagaResult.FINISHED
                    : SagaResult.ROLLBACKED;
        }

        return SagaResult.PROGRESS;
    }

    public Saga chapter(String name) {
        this.chapters.add(new Chapter(name));
        return this;
    }

    /**
     * set value to last chapter.
     *
     * @param value invalue
     * @return this
     */
    public Saga setInValue(Object value) {
        if (chapters.isEmpty()) {
            return this;
        }
        chapters.get(chapters.size() - 1).setInValue(value);
        return this;
    }

    /**
     * get value from current chapter.
     *
     * @return value
     */
    public Object getCurrentValue() {
        return chapters.get(pos).getInValue();
    }


    /**
     * set value to current chapter.
     *
     * @param value to set
     */
    public void setCurrentValue(Object value) {
        chapters.get(pos).setInValue(value);
    }

    /**
     * set status for current chapter.
     *
     * @param result to set
     */
    public void setCurrentStatus(ChapterResult result) {
        chapters.get(pos).setResult(result);
    }

    void setFinished(boolean finished) {
        this.finished = finished;
    }

    boolean isForward() {
        return forward;
    }

    int forward() {
        return ++pos;
    }

    int back() {
        this.forward = false;
        return --pos;
    }

    /**
     * class represents a chapter status and incoming parameters (incoming parameters transforms to out-coming parameters)
     */
    @FieldDefaults(level = AccessLevel.PACKAGE)
    public static class Chapter {
        @Getter
        final String name;
        @Setter
        private ChapterResult result;
        @Getter
        @Setter
        private Object inValue;


        public Chapter(String name) {
            this.name = name;
            this.result = ChapterResult.INIT;
        }

        /**
         * @return true if chapter is good otherwise is bad
         */
        public boolean isSuccess(){
            return result== ChapterResult.SUCCESS;
        }
    }

    public enum ChapterResult {
        INIT, SUCCESS, ROLLBACK
    }

    /**
     * result for saga.
     */
    public enum SagaResult {
        PROGRESS, FINISHED, ROLLBACKED
    }


    @Override
    public String toString() {
        return "Saga{"
                + "chapters="
                + Arrays.toString(chapters.toArray())
                + ", pos="
                + pos
                + ", forward="
                + forward
                + '}';
    }
}
