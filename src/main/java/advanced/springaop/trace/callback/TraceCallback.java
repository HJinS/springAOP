package advanced.springaop.trace.callback;

public interface TraceCallback<T> {
    T call();
}
