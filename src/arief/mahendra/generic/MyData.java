package arief.mahendra.generic;

public class MyData<T> {
    /**
     * T adalah type data generic
     */
    private T data;

    public MyData() {
    }

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
