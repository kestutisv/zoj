package cn.edu.zju.acm.onlinejudge.judgeservice.submissiontest;

import cn.edu.zju.acm.onlinejudge.bean.Submission;

public class PriorityTest {
    private int priority;

    public PriorityTest(int priority) {
        this.priority = priority;
    }

    public boolean test(Submission submission, int priority) {
        return this.priority == priority;
    }

    @Override
    public int hashCode() {
        return this.priority;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PriorityTest) {
            return this.priority == ((PriorityTest) obj).priority;
        }
        return false;
    }
}
