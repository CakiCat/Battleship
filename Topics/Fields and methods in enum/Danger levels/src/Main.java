enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int level;

    DangerLevel(int l) {
            level = l;
    }

    public int getLevel() {
            return level;
    }
}

