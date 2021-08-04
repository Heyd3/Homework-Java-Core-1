package Homework.Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
