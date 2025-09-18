class TaskManager {
    private static class Task {
        int userId;
        int taskId;
        int priority;

        Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }
    private TreeSet<Task> taskSet;

    private Map<Integer, Task> taskMap;

    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();

        taskSet = new TreeSet<>((a, b) -> {
            if (a.priority != b.priority) {
                return b.priority - a.priority;
            } else {
                return b.taskId - a.taskId; 
            }
        });

    
        for (List<Integer> t : tasks) {
            Task task = new Task(t.get(0), t.get(1), t.get(2));
            taskSet.add(task);
            taskMap.put(task.taskId, task);
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        taskSet.add(task);
        taskMap.put(taskId, task);
    }

    public void edit(int taskId, int newPriority) {

        Task task = taskMap.get(taskId);

        if (task != null) {
            taskSet.remove(task);
            task.priority = newPriority; 
            taskSet.add(task);
        }
    }

    public void rmv(int taskId) {
        Task task = taskMap.remove(taskId);
        if (task != null) {
            taskSet.remove(task);
        }
    }

    public int execTop() {
        if (taskSet.isEmpty()) return -1;

        Task top = taskSet.pollFirst();
        taskMap.remove(top.taskId);    
        return top.userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */