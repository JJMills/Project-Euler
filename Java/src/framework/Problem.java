package framework;

@ProblemInfo
public abstract class Problem {
    private final ProblemInfo info;

    public Problem() {
        this.info = this.getClass().getAnnotation(ProblemInfo.class);
    }

    public abstract void solve();

    @Override
    public String toString() {
        return String.format("Problem #%d: %s", info.number(), info.description());
    }
}
